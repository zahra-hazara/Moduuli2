package AssignmentClass.Task4;

public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Example of setting cruise control
        myCar.adjustTargetSpeed(70); // Assuming the speed is within the allowable range
        boolean cruiseControlStatus = myCar.turnOnCruiseControl();

        if (cruiseControlStatus) {
            System.out.println("Cruise Control Enabled: Target speed is " + myCar.getTargetSpeed());
        } else {
            System.out.println("Cruise Control could not be enabled. Target speed out of range or other issue.");
        }

        // Adjust speed or turn off as needed
        myCar.adjustTargetSpeed(80); // Example of adjusting speed
        myCar.turnOffCruiseControl();
    }
}
