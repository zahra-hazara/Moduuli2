package Collections.Task2;
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> itemCosts = new HashMap<>();

    // Add item with cost
    public void addItem(String item, double cost) {
        groceryList.add(item);
        itemCosts.put(item, cost);
        System.out.println("Added: " + item + " - $" + cost);
    }

    // Remove item
    public void removeItem(String item) {
        groceryList.remove(item);
        itemCosts.remove(item);
        System.out.println("\nRemoving \"" + item + "\" from the list...");
    }

    // Display list with costs
    public void displayList() {
        System.out.println("\nGrocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            String item = groceryList.get(i);
            System.out.printf("%d. %s - $%.2f%n",
                    (i + 1), item, itemCosts.get(item));
        }
    }

    // Check if item exists
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (String item : groceryList) {
            total += itemCosts.get(item);
        }
        return total;
    }

    public static void main(String[] args) {
        // Create new grocery list
        GroceryListManager groceries = new GroceryListManager();

        // Add items with costs
        groceries.addItem("Apples", 2.99);
        groceries.addItem("Milk", 3.50);
        groceries.addItem("Bread", 1.99);

        // Display initial list with costs
        groceries.displayList();

        // Check for an item
        System.out.println("\nIs \"Milk\" in the grocery list? " +
                groceries.checkItem("Milk"));

        // Show total cost
        System.out.printf("\nTotal cost: $%.2f%n",
                groceries.calculateTotalCost());

        // Remove an item
        groceries.removeItem("Milk");

        // Show updated list and new total
        groceries.displayList();
        System.out.printf("\nNew total cost: $%.2f%n",
                groceries.calculateTotalCost());
    }
}
