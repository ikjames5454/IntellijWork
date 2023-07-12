package tdd;

public class Calculator {
    private boolean isOn;
    public void power() {
        isOn =! isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }
}
