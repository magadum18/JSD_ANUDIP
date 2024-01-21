import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter methods
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        ArrayList<Book> books = new ArrayList<>();

        // Add Book objects to the ArrayList
        books.add(new Book(1, "Java Programming", "James Gosling"));
        books.add(new Book(2, "Python Basics", "Guido van Rossum"));
        books.add(new Book(3, "Data Structures", "Anuradha A. Puntambekar"));

        // Display all book details using enhanced for loop
        System.out.println("All Book Details:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Book Name: " + book.getBookName());
            System.out.println("Author Name: " + book.getAuthorName());
            System.out.println("----------------------");
        }
    }
}
