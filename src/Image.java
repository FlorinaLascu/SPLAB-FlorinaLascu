public class Image implements Element{

    private String imageName;
    private Subchapter subchapter;

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
}
