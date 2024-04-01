package Collections.Task2;
import java.util.HashMap;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Constructor
    public GroceryListManager () {
    }

    // Adds an item with its cost to the grocery list
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    // Calculates and returns the total cost of the grocery list
    public double calculateTotalCost() {
        double totalCost = 0;
        for (double cost : groceryList.values()) {
            totalCost += cost;
        }
        return totalCost;
    }

    // Displays the grocery list
    public void displayList() {
        System.out.println("Grocery List:");
        groceryList.forEach((item, cost) -> System.out.println("- " + item + ": $" + cost));
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager(); // Fixed class name to match the defined class

        // Adding items to the grocery list with their costs
        manager.addItem("Apples", 2.49);
        manager.addItem("Milk", 3.99);
        manager.addItem("Bread", 2.99);

        // Displaying the grocery list
        manager.displayList();

        // Calculating and displaying the total cost of the grocery list
        System.out.printf("\nTotal Cost: $%.2f\n", manager.calculateTotalCost());
    }
}
