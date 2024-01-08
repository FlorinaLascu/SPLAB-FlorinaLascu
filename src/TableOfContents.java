public class TableOfContents implements Element {
    public void print(){
        System.out.println("It works!");
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
        visitor.visitTableOfContents(this);

    }
}
