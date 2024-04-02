package Association.Task6;

public class Main {
    public static void main(String[] args) {
        // Create library instance
        Library library = new Library();

        // Create user instances
        User alice = new User("Alice", 25);
        User bob = new User("Bob", 30);

        // Add users to library
        library.addUser(alice);
        library.addUser(bob);

        // Users borrow books
        library.borrowBook(alice, "How to win friends and influence people");
        library.borrowBook(bob, "The Hobbit");

        // Print borrowed books
        System.out.println(alice.getName() + " has borrowed: " + alice.getBorrowedBooks());
        System.out.println(bob.getName() + " has borrowed: " + bob.getBorrowedBooks());

        // Users return books
        library.returnBook(alice, "How to win friends and influence people");
        library.returnBook(bob, "The Hobbit");

        // Print borrowed books after return
        System.out.println(alice.getName() + " has borrowed after returning: " + alice.getBorrowedBooks());
        System.out.println(bob.getName() + " has borrowed after returning: " + bob.getBorrowedBooks());
    }
}
