package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class Mp3PlayerTest {
    @Test
    public void testThatIHaveAnMp3Player() {
        Mp3Player player = new Mp3Player();
        assertNotNull(player);
    }

    @Test
    public void testThatIHaveAnMp3PlayerAndICanTurnItOn() {
        Mp3Player player = new Mp3Player();
        player.power();
        assertTrue(player.getIsOn());
    }

    @Test
    public void testThatIHaveAnMp3PlayerAndICanTurnItOff() {
        Mp3Player player = new Mp3Player();
        player.power();
        assertTrue(player.getIsOn());

        player.power();
        assertFalse(player.getIsOn());
    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndItHasSound() {
        Mp3Player player = new Mp3Player();
        player.power();
        boolean isMyMp3HasSound = player.hasSound();
        assertTrue(isMyMp3HasSound);

    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanIncreaseVolume() {
        Mp3Player player = new Mp3Player();
        player.power();
        player.setVolume(50);
        int initialVolume = player.getVolume();
        assertEquals(50, initialVolume);

        player.increaseVolume();
        int newVolume = player.getVolume();
        assertEquals(51, newVolume);
    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanDecreaseVolume() {
        Mp3Player player = new Mp3Player();
        player.power();
        player.setVolume(50);
        int initialVolume = player.getVolume();
        assertEquals(50, initialVolume);

        player.decreaseVolume();
        int newVolume = player.getVolume();
        assertEquals(49, newVolume);

    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanDecreaseVolumeBelowZero() {
        Mp3Player player = new Mp3Player();
        player.power();
        player.setVolume(0);
        int initialVolume = player.getVolume();
        assertEquals(0, initialVolume);

        player.decreaseVolume();
        int newVolume = player.getVolume();
        assertEquals(0, newVolume);
    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanIncreaseVolumeAboveHundred() {
        Mp3Player player = new Mp3Player();
        player.power();
        player.setVolume(100);
        int initialVolume = player.getVolume();
        assertEquals(100, initialVolume);

        player.increaseVolume();
        int newVolume = player.getVolume();
        assertEquals(100, newVolume);

    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanIPlay() {
        Mp3Player player = new Mp3Player();
        player.power();
        player.playButton();
        assertTrue(player.getCanPlay());

    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanIPause() {
        Mp3Player player = new Mp3Player();
        player.power();
        player.playButton();
        assertTrue(player.getCanPlay());

        player.playButton();
        assertFalse(player.getCanPlay());
    }

    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanINext() {
        Mp3Player player = new Mp3Player();
        player.power();
        boolean isMyMp3CanNext = player.getCanNext();
        assertTrue(isMyMp3CanNext);

    }
    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanIPrevious() {
        Mp3Player player = new Mp3Player();
        player.power();
        boolean isMyMp3CanPrevious = player.getCanPrevious();
        assertTrue(isMyMp3CanPrevious);

}
    @Test
    public void testThatIHaveAnMp3PlayerAndIsOnAndICanPrePlay() {
        Mp3Player player = new Mp3Player();
        player.power();
        player.setSong(5);
        int song= player.getSong();
        assertEquals(5,song);

        player.previousSong();
        int newSong = player.getSong();
        assertEquals(4,newSong);

    }




}

