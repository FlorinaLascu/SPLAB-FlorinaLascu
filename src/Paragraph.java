public class Paragraph implements Element {

    private String text;
    private Subchapter subchapter;

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
}
