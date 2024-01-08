public class Paragraph implements Element {

    private String text;
    private AlignStrategy alignStrategy;


    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Paragraph: " + text;
    }

    public void print() {
        if(this.alignStrategy != null) {
            this.alignStrategy.render(text);
        } else {
            System.out.println(this);
        }
    }
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
