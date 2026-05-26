import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    // Constructor to set up the book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book info
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + isbn;
    }
}

public class Main {
    public static void main(String[] args) {
        // This list will act as our collection
        ArrayList<Book> collection = new ArrayList<>();

        // 1. Add books to the collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "12345");
        Book book2 = new Book("1984", "George Orwell", "67890");
        
        collection.add(book1);
        collection.add(book2);

        System.out.println("Collection after adding books:");
        for (Book b : collection) {
            System.out.println(b);
        }

        // 2. Remove a book from the collection
        collection.remove(book1);

        System.out.println("\nCollection after removing 'The Great Gatsby':");
        for (Book b : collection) {
            System.out.println(b);
        }
    }
}
