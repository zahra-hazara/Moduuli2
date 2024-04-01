package Collections.Task1;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        } else {
            System.out.println(item + " is already in the grocery list.");
        }
    }

    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
        } else {
            System.out.println("Cannot remove " + item + " - item is not in the grocery list.");
        }
    }

    public void displayList() {
        System.out.println("Grocery List:");
        int index = 1;
        for (String item : groceryList) {
            System.out.println(index++ + ". " + item);
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Adding items to the grocery list
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");
        manager.addItem("Milk"); // Attempt to add a duplicate item

        // Displaying the grocery list
        manager.displayList();

        // Checking if an item is present in the grocery list
        String checkItem = "Milk";
        System.out.println("\nIs \"" + checkItem + "\" in the grocery list? " + manager.checkItem(checkItem));

        // Removing an item from the grocery list
        System.out.println("\nRemoving \"" + checkItem + "\" from the list...");
        manager.removeItem(checkItem);

        // Attempting to remove a non-existent item
        manager.removeItem("Bananas");

        // Displaying the updated grocery list
        System.out.println("\nUpdated Grocery List:");
        manager.displayList();
    }
}
