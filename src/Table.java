public class Table implements Element{

    private String title;
    private Subchapter subchapter;

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
}
