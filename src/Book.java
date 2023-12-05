

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{

    private String title;
    private List<Author> authors;
    private TableOfContents tableOfContents;


    public Book(String title) {
        super(title);
        this.authors = new ArrayList<>();
    }


    public void print() {

            for (Author author:authors) {
                author.print();
            }
            super.print();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Section section) {
    }
}
