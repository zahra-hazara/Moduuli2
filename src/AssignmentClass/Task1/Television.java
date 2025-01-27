package AssignmentClass.Task1;

public class Television {
    private boolean isOn;
    private int currentChannel;
    private static final int MAX_CHANNEL = 10;

    public Television() {
        this.isOn = false;
        this.currentChannel = 1;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void changeChannel() {
        if (isOn) {
            currentChannel = (currentChannel % MAX_CHANNEL) + 1;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public boolean isOn() {
        return isOn;
    }
}
