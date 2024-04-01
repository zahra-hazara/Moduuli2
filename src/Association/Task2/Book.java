package Association.Task2;
class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return title + ": Author - " + author + ", Publication Year - " + publicationYear;
    }
}