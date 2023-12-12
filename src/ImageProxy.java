import java.awt.*;

public class ImageProxy implements Picture {

    String url;
    Dimension dim;
    Image realImage;

    public ImageProxy(String url, Dimension dim) {
        this.url = url;
        this.dim = dim;
    }

    Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }

    public void print() {
        System.out.println("Image Information:");
        System.out.println("URL: " + url);
        System.out.println("Dimensions: " + dim.getWidth() + " x " + dim.getHeight());
    }

    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }


}
