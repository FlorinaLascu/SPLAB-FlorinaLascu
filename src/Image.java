public class Image implements Element{

    private String imageName;


    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Image: " + imageName;
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
