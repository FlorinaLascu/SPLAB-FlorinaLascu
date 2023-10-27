import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String name;
    private List<Subchapter> subchapterList;

    private Book book;

    public Chapter(String name) {
        this.name = name;
        this.subchapterList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Chapter: " + name;
    }
    public void print() {
        System.out.println(this);
    }

    public int createSubchapter(String subchapterTitle) {
        Subchapter subchapter = new Subchapter(subchapterTitle);
        subchapterList.add(subchapter);
        return subchapterList.size() - 1;
    }

    public Subchapter getSubchapter(int index) throws Exception {
        if (index >= 0 && index <subchapterList.size()) {
            return subchapterList.get(index);
        } else throw new Exception();
    }
}
