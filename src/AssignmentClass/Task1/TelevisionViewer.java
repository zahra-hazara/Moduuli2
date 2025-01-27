package AssignmentClass.Task1;
public class TelevisionViewer {
    public static void main(String[] args) {
        Television tv = new Television();

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);
            tv.turnOn();

            // Watch 3-4 channels depending on the day
            int channelsToWatch = (day % 2 == 1) ? 6 : 4;

            for (int i = 0; i < channelsToWatch; i++) {
                if (i > 0) {
                    tv.changeChannel();
                }
                System.out.println("Watching channel " + tv.getCurrentChannel());
            }

            tv.turnOff();
            System.out.println("Falling asleep");
        }
    }
}