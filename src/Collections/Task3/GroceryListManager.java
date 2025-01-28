package Collections.Task3;
import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();
    private HashMap<String, Double> itemCosts = new HashMap<>();
    private HashMap<String, String> itemCategories = new HashMap<>();

    // Add item with cost and category
    public void addItem(String item, double cost, String category) {
        groceryList.add(item);
        itemCosts.put(item, cost);
        itemCategories.put(item, category);
        System.out.println("Added: " + item + " - $" + cost + " (" + category + ")");
    }

    // Remove item
    public void removeItem(String item) {
        groceryList.remove(item);
        itemCosts.remove(item);
        itemCategories.remove(item);
        System.out.println("\nRemoving \"" + item + "\" from the list...");
    }

    // Display full list
    public void displayList() {
        System.out.println("\nGrocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            String item = groceryList.get(i);
            System.out.printf("%d. %s - $%.2f (%s)%n",
                    (i + 1), item, itemCosts.get(item), itemCategories.get(item));
        }
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("\nItems in category '" + category + "':");
        int count = 1;
        for (String item : groceryList) {
            if (itemCategories.get(item).equals(category)) {
                System.out.printf("%d. %s - $%.2f%n",
                        count++, item, itemCosts.get(item));
            }
        }
    }

    // Calculate total cost
    public double calculateTotalCost() {
        double total = 0;
        for (String item : groceryList) {
            total += itemCosts.get(item);
        }
        return total;
    }

    // Calculate total cost by category
    public double calculateCategoryTotal(String category) {
        double total = 0;
        for (String item : groceryList) {
            if (itemCategories.get(item).equals(category)) {
                total += itemCosts.get(item);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        // Create new grocery list
        GroceryListManager groceries = new GroceryListManager();

        // Add items with costs and categories
        groceries.addItem("Apples", 2.99, "Fruits");
        groceries.addItem("Bananas", 1.99, "Fruits");
        groceries.addItem("Milk", 3.50, "Dairy");
        groceries.addItem("Cheese", 4.99, "Dairy");
        groceries.addItem("Bread", 1.99, "Bakery");

        // Display full list
        groceries.displayList();

        // Display items by category
        groceries.displayByCategory("Fruits");
        groceries.displayByCategory("Dairy");

        // Show total cost
        System.out.printf("\nTotal cost of all items: $%.2f%n",
                groceries.calculateTotalCost());

        // Show total cost by category
        System.out.printf("Total cost of Fruits: $%.2f%n",
                groceries.calculateCategoryTotal("Fruits"));
        System.out.printf("Total cost of Dairy: $%.2f%n",
                groceries.calculateCategoryTotal("Dairy"));
    }
}