package Association.Task6;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private List<String> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(String book) {
        borrowedBooks.add(book);
    }

    public void returnBook(String book) {
        borrowedBooks.remove(book);
    }
}
