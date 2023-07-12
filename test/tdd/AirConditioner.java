package tdd;

public class AirConditioner {

    private boolean isOn;
    private int temperature;


    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public Boolean getIsOn() {
        return isOn;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature++;
        }
    }


    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if(temperature > 16) {
            temperature--;
        }
    }


    public void inputNegativeTemperature() {
        if (temperature > 16){
            temperature = temperature;


}
    }
}
