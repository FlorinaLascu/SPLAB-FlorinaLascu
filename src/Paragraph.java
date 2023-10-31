public class Paragraph implements Element {

    private String text;


    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph: " + text;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public int get(Element element) {
        return 0;
    }
}
