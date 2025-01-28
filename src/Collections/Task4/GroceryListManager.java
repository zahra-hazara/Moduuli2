package Collections.Task4;
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> itemCosts = new HashMap<>();
    private HashMap<String, String> itemCategories = new HashMap<>();
    private HashMap<String, Integer> itemQuantities = new HashMap<>();

    // Add item with all details
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(item);
        itemCosts.put(item, cost);
        itemCategories.put(item, category);
        itemQuantities.put(item, quantity);
        System.out.println("Added: " + item + " (Quantity: " + quantity + ")");
    }

    // Remove item
    public void removeItem(String item) {
        groceryList.remove(item);
        itemCosts.remove(item);
        itemCategories.remove(item);
        itemQuantities.remove(item);
        System.out.println("\nRemoving \"" + item + "\" from the list...");
    }

    // Display list
    public void displayList() {
        System.out.println("\nGrocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            String item = groceryList.get(i);
            System.out.printf("%d. %s - $%.2f - Quantity: %d%n",
                    (i + 1), item, itemCosts.get(item), itemQuantities.get(item));
        }
    }

    // Update quantity
    public void updateQuantity(String item, int newQuantity) {
        if (groceryList.contains(item)) {
            itemQuantities.put(item, newQuantity);
            System.out.println("Updated quantity for " + item + " to " + newQuantity);
        } else {
            System.out.println("Item not found in the list.");
        }
    }

    // Display available items (quantity > 0)
    public void displayAvailableItems() {
        System.out.println("\nAvailable Items (Quantity > 0):");
        int count = 1;
        for (String item : groceryList) {
            if (itemQuantities.get(item) > 0) {
                System.out.printf("%d. %s - Quantity: %d%n",
                        count++, item, itemQuantities.get(item));
            }
        }
    }

    public static void main(String[] args) {
        // Create new grocery list
        GroceryListManager groceries = new GroceryListManager();

        // Add items with quantities
        System.out.println("=== Adding Items with Quantities ===");
        groceries.addItem("Apples", 0.50, "Fruits", 5);
        groceries.addItem("Milk", 2.99, "Dairy", 2);
        groceries.addItem("Bread", 1.99, "Bakery", 0);
        groceries.addItem("Cheese", 3.99, "Dairy", 3);

        // Display initial list
        groceries.displayList();

        // Display only available items
        groceries.displayAvailableItems();

        // Update quantities
        System.out.println("\n=== Updating Quantities ===");
        groceries.updateQuantity("Apples", 3);
        groceries.updateQuantity("Bread", 1);

        // Display updated available items
        groceries.displayAvailableItems();

        // Try to update non-existent item
        System.out.println("\n=== Testing Error Handling ===");
        groceries.updateQuantity("Cookies", 2);

        // Final list display
        groceries.displayList();
    }
}
