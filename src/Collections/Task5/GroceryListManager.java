package Collections.Task5;
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
            System.out.printf("%d. %s - $%.2f (%s) - Quantity: %d%n",
                    (i + 1), item, itemCosts.get(item),
                    itemCategories.get(item), itemQuantities.get(item));
        }
    }

    // Display by category
    public void displayByCategory(String category) {
        System.out.println("\nItems in category '" + category + "':");
        int count = 1;
        for (String item : groceryList) {
            if (itemCategories.get(item).equals(category)) {
                System.out.printf("%d. %s - $%.2f - Quantity: %d%n",
                        count++, item, itemCosts.get(item), itemQuantities.get(item));
            }
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

    // Calculate total cost (considering quantities)
    public double calculateTotalCost() {
        double total = 0;
        for (String item : groceryList) {
            total += itemCosts.get(item) * itemQuantities.get(item);
        }
        return total;
    }

    // Test all features
    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        System.out.println("=== Testing Basic Functionality ===");

        // Test adding items
        System.out.println("\nAdding items to the list:");
        manager.addItem("Apples", 0.50, "Fruits", 5);
        manager.addItem("Milk", 2.99, "Dairy", 2);
        manager.addItem("Bread", 1.99, "Bakery", 1);
        manager.addItem("Cheese", 3.99, "Dairy", 3);
        manager.addItem("Bananas", 0.30, "Fruits", 6);

        // Display initial list
        manager.displayList();

        // Test category display
        System.out.println("\n=== Testing Category Display ===");
        manager.displayByCategory("Fruits");
        manager.displayByCategory("Dairy");

        // Test quantity update
        System.out.println("\n=== Testing Quantity Update ===");
        manager.updateQuantity("Apples", 8);
        manager.updateQuantity("Milk", 3);

        // Display updated list
        manager.displayList();

        // Test total cost calculation
        System.out.println("\n=== Testing Total Cost Calculation ===");
        double totalCost = manager.calculateTotalCost();
        System.out.printf("Total cost (including quantities): $%.2f%n", totalCost);

        // Test removing items
        System.out.println("\n=== Testing Item Removal ===");
        manager.removeItem("Bread");

        // Final display
        System.out.println("\n=== Final List ===");
        manager.displayList();
        System.out.printf("\nFinal total cost: $%.2f%n", manager.calculateTotalCost());
    }
}