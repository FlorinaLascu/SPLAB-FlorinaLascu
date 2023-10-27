import java.util.ArrayList;
import java.util.List;

public class Subchapter {

    private String name;
    private Chapter chapter;
    private List<Element> elements;

    public Subchapter(String name){
        this.name = name;
        this.elements = new ArrayList<>();
    }
    @Override
    public  String toString() {
        return "Subchapter: " + name;
    }


    public void createNewParagraph(String text) {
        this.elements.add(new Paragraph(text));
    }

    public void createNewImage(String name) {
        this.elements.add(new Image(name));
    }

    public void createNewTable(String title) {
        this.elements.add(new Table(title));
    }
    public void print() {
        System.out.println(this);
        for(Element e: this.elements) {
            System.out.println(e);
        }
    }
}
