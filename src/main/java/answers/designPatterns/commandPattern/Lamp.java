package answers.designPatterns.commandPattern;

public class Lamp {
    private boolean isOn = false;

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
