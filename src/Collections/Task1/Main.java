package Collections.Task1;

public class Main {
    public static void main(String[] args) {
        // Create new grocery list
        GroceryListManager groceries = new GroceryListManager();

        // Add items
        groceries.addItem("Apples");
        groceries.addItem("Milk");
        groceries.addItem("Bread");

        // Show initial list
        groceries.displayList();

        // Check for Milk
        System.out.println("\nIs \"Milk\" in the grocery list? " + groceries.checkItem("Milk"));

        // Remove Milk
        groceries.removeItem("Milk");

        // Show updated list
        System.out.println("\nUpdated Grocery List:");
        for (int i = 0; i < groceries.groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceries.groceryList.get(i));
        }
    }
}
