package AssignmentClass.Task3;
public class CoffeeMaker {
    // coffee types
    public static final String NORMAL = "normal";
    public static final String ESPRESSO = "espresso";

    private boolean isOn;
    private String coffeeType;
    private int coffeeAmount;

    // Constructor initializes the coffee maker with default settings
    public CoffeeMaker() {
        this.isOn = false; // Coffee maker starts off
        this.coffeeType = NORMAL; // Default coffee type
        this.coffeeAmount = 10; // Default starting coffee amount
    }

    // Toggles the power state of the coffee maker
    public void pressOnOff() {
        isOn = !isOn;
    }

    // Sets the coffee type if the coffee maker is on
    public void setCoffeeType(String coffeeType) {
        if (this.isOn && (NORMAL.equals(coffeeType) || ESPRESSO.equals(coffeeType))) {
            this.coffeeType = coffeeType;
        }
    }

    // Sets the coffee amount if the coffee maker is on and the amount is within the valid range
    public void setCoffeeAmount(int coffeeAmount) {
        if (this.isOn && coffeeAmount >= 10 && coffeeAmount <= 80) {
            this.coffeeAmount = coffeeAmount;
        }
    }

    // Returns true if the coffee maker is on
    public boolean isOn() {
        return isOn;
    }

    // Returns the currently selected coffee type
    public String getCoffeeType() {
        return coffeeType;
    }

    // Returns the currently set coffee amount
    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    // Method to make coffee
    public void makeCoffee() {
        if (this.isOn) {
            // Coffee making process...
            System.out.println("Making " + coffeeType + " coffee, " + coffeeAmount + " ml.");
        }
    }

}

