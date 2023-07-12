package tdd;

public class Television {
    private boolean isOn;
    private int volume;
    private int channel;
    private int brightness;


    public void setIsOn(boolean isOn) {
        this.isOn = isOn;



    }

    public boolean getIsOn() {
        return isOn;
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

    public int geVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if(volume > 0) {
            volume--;
        }
    }


    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public boolean hasVolume(){
        return true;
    }


    public boolean hasChannels() {
        return true;
    }


    public void changeChannelForward() {
        if(channel < 100) {
            channel++;
        }
    }

    public void changeChannelBackward() {
        if(channel > 1) {
            channel--;
        }
    }

    public boolean hasSound() {
        return true;
    }

    public boolean hasSettings() {
        return true;
    }

    public boolean hasBrightness() {
        return true;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getBrightness() {
        return brightness;
    }

    public void increaseBrightness() {
        brightness++;
    }

    public void decreaseBrightness() {
        brightness--;
    }
}

