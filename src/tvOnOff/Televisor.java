package tvOnOff;

public class Televisor {
    boolean isOn;

    Televisor(boolean isOn) {
        this.isOn = isOn;
    }

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void showStatus() {
        System.out.println("Czy tv jest wlaczony? " + isOn);
    }
}
