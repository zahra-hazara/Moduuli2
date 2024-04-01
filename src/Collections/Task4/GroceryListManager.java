package Collections.Task4;

import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private Map<String, Integer> itemQuantities = new HashMap<>();
    public void addItemWithQuantity(String item, int quantity) {
        itemQuantities.put(item, itemQuantities.getOrDefault(item, 0) + quantity);
    }
    public void updateQuantity(String item, int newQuantity) {
        if (itemQuantities.containsKey(item)) {
            itemQuantities.put(item, newQuantity);
        } else {
            System.out.println("Item does not exist in the list: " + item);
        }
    }
    public void displayAvailableItems() {
        System.out.println("Available Items:");
        itemQuantities.forEach((item, quantity) -> {
            if (quantity > 0) {
                System.out.println("- " + item + ": Quantity = " + quantity);
            }
        });
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items to the grocery list with their quantities
        manager.addItemWithQuantity("Apples", 5);
        manager.addItemWithQuantity("Bananas", 2);
        manager.addItemWithQuantity("Milk", 1);

        // Displaying available items
        manager.displayAvailableItems();

        // Updating the quantity of an item
        System.out.println("\nUpdating quantity of 'Bananas' to 3.");
        manager.updateQuantity("Bananas", 3);

        // Displaying available items after update
        System.out.println("\nAvailable Items after update:");
        manager.displayAvailableItems();
    }
}

