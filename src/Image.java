import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Picture{

    private String imageName;
    private String url;
    private List<ImageProxy> realImg;


    public Image(String imageName) {

        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

    @Override
    public String url() {
        return null;
    }

    @Override
    public Dimension dim() {
        return null;
    }

    //@Override
    //public PictureContent content() {
      //  return null;
    //}
}
