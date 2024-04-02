package Association.Task6;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private Map<User, List<String>> userBooksMap;

    public Library() {
        userBooksMap = new HashMap<>();
    }

    public void addUser(User user) {
        userBooksMap.putIfAbsent(user, user.getBorrowedBooks());
    }

    public void borrowBook(User user, String book) {
        userBooksMap.get(user).add(book);
        user.borrowBook(book);
    }

    public void returnBook(User user, String book) {
        userBooksMap.get(user).remove(book);
        user.returnBook(book);
    }

    // This method can be used to get a list of all books borrowed by a user
    public List<String> getUserBorrowedBooks(User user) {
        return userBooksMap.getOrDefault(user, null);
    }

    // Add more methods as needed for library management
}
