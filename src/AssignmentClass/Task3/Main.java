package AssignmentClass.Task3;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        // Attempt to set coffee type and amount while the machine is off
        myCoffeeMaker.setCoffeeType(CoffeeMaker.ESPRESSO);
        myCoffeeMaker.setCoffeeAmount(50);
        System.out.println("Attempted to set while off: " + myCoffeeMaker.getCoffeeType() + ", " + myCoffeeMaker.getCoffeeAmount() + "ml");

        // Turn the coffee maker on
        myCoffeeMaker.pressOnOff();

        // Set the coffee type to espresso
        myCoffeeMaker.setCoffeeType(CoffeeMaker.ESPRESSO);

        // Set the coffee amount to 50 ml
        myCoffeeMaker.setCoffeeAmount(50);

        // Make coffee
        myCoffeeMaker.makeCoffee();

        // Check the selections
        System.out.println("Selected: " + myCoffeeMaker.getCoffeeType() + ", " + myCoffeeMaker.getCoffeeAmount() + "ml");

        // Turn the coffee maker off
        myCoffeeMaker.pressOnOff();

        // The settings should be remembered for when we turn it back on
        myCoffeeMaker.pressOnOff();
        myCoffeeMaker.makeCoffee(); // Should make the same coffee as before
    }
}
