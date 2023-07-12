package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {
    @Test
    public void i_Hava_A_Television(){
        Television myTelevision = new Television();
        assertNotNull(myTelevision);

    }
    @Test
    public void i_Have_A_Television_And_isOn(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(false);
        boolean myTelevisionIsOn = myTelevision.getIsOn();
        assertFalse(myTelevisionIsOn);

        myTelevision.setIsOn(true);
        boolean condition = myTelevision.getIsOn();
        assertTrue(condition);



    }
    @Test
    public void i_Have_A_Television_And_isOff(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        boolean myTelevisionIsOn = myTelevision.getIsOn();
        assertTrue(myTelevisionIsOn);

        myTelevision.setIsOn(false);
        boolean condition = myTelevision.getIsOn();
        assertFalse(condition);


    }
    @Test
    public void i_Have_Television_and_IsOn_And_I_Increase_Volume(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setVolume(62);
        assertEquals(62,myTelevision.getVolume());

        myTelevision.increaseVolume();
        int newVolume = myTelevision.geVolume();
        assertEquals(63,newVolume);


    }
    @Test
    public void i_Have_Television_and_IsOn_And_I_Decrease_Volume(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setVolume(33);
        assertEquals(33,myTelevision.getVolume());

        myTelevision.decreaseVolume();
        int newVolume = myTelevision.getVolume();
        assertEquals(32,newVolume);


    }
    @Test
    public void i_Have_Television_and_IsOn_And_I_Increase_Volume_Multiple_Times_And_Decrease() {
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setVolume(30);
        assertEquals(30, myTelevision.getVolume());

        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.increaseVolume();
        myTelevision.decreaseVolume();
        int newVolume = myTelevision.getVolume();
        assertEquals(35, newVolume);


    }
    @Test
    public void testThatMyTVHasVolumeWhenIsOn(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        boolean isMyTelevisionHasVolume = myTelevision.hasVolume();
        assertTrue(isMyTelevisionHasVolume);

    }
    @Test
    public void testThatICanReduceTheVolumeBelowZero(){
    Television myTelevision = new Television();
    myTelevision.setIsOn(true);
    myTelevision.setVolume(0);
    assertEquals(0,myTelevision.getVolume());

    myTelevision.decreaseVolume();
    int newVolume = myTelevision.getVolume();
    assertEquals(0,newVolume);


}
    @Test
    public void testThatICanIncreaseTheVolumeAboveHundred(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setVolume(100);
        assertEquals(100, myTelevision.getVolume());

        myTelevision.increaseVolume();
        int newVolume = myTelevision.getVolume();
        assertEquals(100, newVolume);
    }
    @Test
    public void testThatIHaveChannelWhenTheTVIsOn(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        boolean isMyTelevisionHasChannels = myTelevision.hasChannels();
        assertTrue(isMyTelevisionHasChannels);


    }
    @Test
    public void testThatMyTVIsOnAndICanChangeChannelForward(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setChannel(15);
        assertEquals(15,myTelevision.getChannel());

        myTelevision.changeChannelForward();
        int newChannel = myTelevision.getChannel();
        assertEquals(16,newChannel);


    }
    @Test
    public void testThatMyTVisOnAndICanChangeChannelBackward(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setChannel(10);
        assertEquals(10,myTelevision.getChannel());

        myTelevision.changeChannelBackward();
        int newChannel = myTelevision.getChannel();
        assertEquals(9,newChannel);



    }
    @Test
    public void testThatMyTVIsOnAndChangeChannelBeyondHundred(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setChannel(100);
        assertEquals(100,myTelevision.getChannel());

        myTelevision.changeChannelForward();
        int newChannel = myTelevision.getChannel();
        assertEquals(100,newChannel);
    }

    @Test
    public void testThatMyTVIsOnAndChangeChannelBelowOne(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setChannel(1);
        assertEquals(1,myTelevision.getChannel());

        myTelevision.changeChannelBackward();
        int newChannel = myTelevision.getChannel();
        assertEquals(1,newChannel);


    }
    @Test
    public void testThatMyTVIsOnAndHasSound(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        boolean isMyTVIsOnAndHasSound = myTelevision.hasSound();
        assertTrue(isMyTVIsOnAndHasSound);

    }
    @Test
    public void testThatMyTVIsOnAndHasSetting(){
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        boolean isMyTVIsOnAndHasSetting = myTelevision.hasSettings();
        assertTrue(isMyTVIsOnAndHasSetting);


    }
    @Test
    public void testThatMyTVIsOnAndHasBrightness() {
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        boolean isMyTVIsOnAndHasBrightness = myTelevision.hasBrightness();
        assertTrue(isMyTVIsOnAndHasBrightness);


    }
    @Test
    public void testThatMyTVIsOnAndBrightnessCanIncrease() {
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setBrightness(7);
        assertEquals(7,myTelevision.getBrightness());

        myTelevision.increaseBrightness();
        int newBrightness = myTelevision.getBrightness();
        assertEquals(8,newBrightness);

    }

    @Test
    public void testThatMyTVIsOnAndBrightnessCanDecrease() {
        Television myTelevision = new Television();
        myTelevision.setIsOn(true);
        myTelevision.setBrightness(5);
        assertEquals(5,myTelevision.getBrightness());

        myTelevision.decreaseBrightness();
        int newBrightness = myTelevision.getBrightness();
        assertEquals(4,newBrightness);

    }


}
