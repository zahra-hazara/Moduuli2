package AssignmentClass.Task1;

public class Television {
    private boolean isOn = false;
    private int channel = 1;

    //behaivor
    public void pressOnOff() {
        isOn = !isOn;
        if (isOn) {
            channel = 1;
        }
    }
    //for check
    public boolean isOn() {
        return isOn;
    }
    // get channel
    public int getChannel() {
        return channel;
    }

    //set the channel
    public void setChannel(int channel) {
        // Assuming the TV has channels 1 to 10, looping back to 1 after 10
        if (channel > 10) {
            this.channel = 1;
        } else {
            this.channel = channel;
        }
    }
}
