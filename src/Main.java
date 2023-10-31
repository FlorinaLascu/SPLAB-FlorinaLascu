import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to store books
        List<Book> books = new ArrayList<>();

        // Create and add books to the list
        Book book1 = new Book("Divergent");
        Book book2 = new Book("Harry Potter");
        Author author2 = new Author("JK Rowling");
        book2.addAuthor(author2);

        // Create sections for each book
        Section section1 = new Section("Introduction");
        Section section2 = new Section("Chapter 1");
        Section section3 = new Section("Prologue");
        Section section4 = new Section("Chapter 2");

        book2.add(section1);

        // Add books to the list
        books.add(book1);
        books.add(book2);

        // Print both books with their sections
        for (Book book : books) {
            book.print();
        }

        book1.print();
    }
}
