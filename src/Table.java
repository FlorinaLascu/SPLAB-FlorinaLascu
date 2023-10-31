public class Table implements Element{

    private String title;


    public Table(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Table: " + title;
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
