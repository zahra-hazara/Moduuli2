package Collections.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryListManager {
    private Map<String, List<String>> categorizedItems = new HashMap<>();

    public void addItemWithCategory(String item, String category) {
        categorizedItems.computeIfAbsent(category, k -> new ArrayList<>()).add(item);
    }
    public void displayByCategory(String category) {
        if (categorizedItems.containsKey(category)) {
            System.out.println(category + " Items:");
            List<String> items = categorizedItems.get(category);
            for (String item : items) {
                System.out.println("- " + item);
            }
        } else {
            System.out.println("No items found in category: " + category);
        }
    }

    // Existing methods...

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items to the grocery list with their categories
        manager.addItemWithCategory("Apples", "Fruits");
        manager.addItemWithCategory("Bananas", "Fruits");
        manager.addItemWithCategory("Milk", "Dairy");
        manager.addItemWithCategory("Bread", "Bakery");

        // Displaying items by category
        manager.displayByCategory("Fruits");
        manager.displayByCategory("Dairy");
        manager.displayByCategory("Bakery");
    }
}

