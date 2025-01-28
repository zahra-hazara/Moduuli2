package Collections.Task1;
import java.util.ArrayList;

public class GroceryListManager {
    public ArrayList<String> groceryList = new ArrayList<>();

    // Add item to the list
    public void addItem(String item) {
        groceryList.add(item);
    }

    // Remove item from the list
    public void removeItem(String item) {
        groceryList.remove(item);
        System.out.println("Removing \"" + item + "\" from the list...");
    }

    // Display all items
    public void displayList() {
        System.out.println("\nGrocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Check if item exists
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

}