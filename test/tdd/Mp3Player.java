package tdd;

public class Mp3Player {
    private boolean isOn;
    private int volume;
    private boolean canPlay;
    private int song;
    public void power() {
        isOn =! isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }


    public boolean hasSound() {
        return true;
    }

    public void setVolume(int volume) {
        this.volume = volume;

    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
       if (volume > 0) {
            volume--;
        }
    }

    public void playButton() {
        canPlay =! canPlay;
    }

    public boolean getCanPlay() {
        return canPlay;
    }


    public boolean getCanNext() {
        return true;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public int getSong() {
        return song;
    }

    public void previousSong() {
        song--;

    }

    public boolean getCanPrevious() {
        return true;
    }
}
