import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private String title;
    private List<Element> elements;
    public Section(String title) {
        this.title = title;
        elements = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println(title);
      /*  for (Element e:elements) {
            e.print();
        }*/
    }

    @Override
    public void add(Element element) {

        elements.add(element);
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public int get(Element element) {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        for(Element e: elements ){
            e.accept(visitor);
        }
    }
}
