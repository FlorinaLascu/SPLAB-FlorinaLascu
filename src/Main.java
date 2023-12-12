import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{

        long startTime = System.currentTimeMillis();
        Image img1 = new Image("Pamela Anderson");
        Image img2 = new Image("Kim Kardashian");
        Image img3 = new Image("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");

        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
        // Create a list to store books
      //  List<Book> books = new ArrayList<>();

        // Create and add books to the list
       // Book book1 = new Book("Divergent");
       // Book book2 = new Book("Harry Potter");
       // Author author2 = new Author("JK Rowling");
        //book2.addAuthor(author2);

        // Create sections for each book
       // Section section1 = new Section("Introduction");
        //Section section2 = new Section("Chapter 1");
        //Section section3 = new Section("Prologue");
        //Section section4 = new Section("Chapter 2");

        //book2.add(section1);

        // Add books to the list
        //books.add(book1);
        //books.add(book2);

        // Print both books with their sections
       // for (Book book : books) {
         //   book.print();
      //  }

        //book1.print();
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraf 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraf 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraf 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraf 4");
        cap1.add(p4);
        RenderContentVisitor rend = new RenderContentVisitor();
        cap1.accept(rend);

        StatisticsVisitor stat = new StatisticsVisitor();
        System.out.println("=========Book statistics==========");
        cap1.accept(stat);
        stat.printStatistics();
    }


}
