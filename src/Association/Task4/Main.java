package Association.Task4;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Title", "Author", 2021);
        library.addBook(book);

        // Set the rating for the book
        book.setRating(4.5);
        // Add a review for the book
        book.addReview("An excellent introduction to Java programming!");

        // Demonstrate getting the rating and reviews
        System.out.println("Rating for the book: " + book.getRating());
        System.out.println("Reviews for the book:");
        for (String review : book.getReviews()) {
            System.out.println(review);
        }
    }
}
