package AssignmentClass.Task4;
public class Car {
    private boolean cruiseControlEnabled = false;
    private int currentSpeed = 0; // Current speed of the car
    private int targetSpeed = 0; // Target speed set for cruise control
    private final int minSpeed = 20; // Minimum speed for cruise control
    private final int maxSpeed = 100; // Maximum speed for cruise control

    // Set the target speed, ensuring it's within allowed bounds
    // Method to adjust the target speed
    public void adjustTargetSpeed(int newSpeed) {
        if(newSpeed >= minSpeed && newSpeed <= maxSpeed) {
            targetSpeed = newSpeed;
            System.out.println("Target speed adjusted to: " + targetSpeed);
        } else {
            System.out.println("New speed must be between " + minSpeed + " and " + maxSpeed);
        }
    }

    public int getTargetSpeed() {
        return targetSpeed;
    }

    // Attempt to turn on cruise control
    public boolean turnOnCruiseControl() {
        if (targetSpeed >= minSpeed && targetSpeed <= maxSpeed) {
            cruiseControlEnabled = true;
            // Simulate reaching the target speed...
            System.out.println("Cruise Control Enabled: Reaching target speed of " + targetSpeed);
            return true;
        } else {
            System.out.println("Cannot enable Cruise Control: Target speed out of range");
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlEnabled = false;
        System.out.println("Cruise Control Disabled");
    }

    // Example method to simulate car behavior (optional)
    public void drive() {
        if (cruiseControlEnabled) {
            // Simplified logic to adjust speed towards the target speed
            if (currentSpeed < targetSpeed) {
                currentSpeed++; // Accelerate
            } else if (currentSpeed > targetSpeed) {
                currentSpeed--; // Decelerate
            }
            System.out.println("Current speed: " + currentSpeed);
        }
    }

}
