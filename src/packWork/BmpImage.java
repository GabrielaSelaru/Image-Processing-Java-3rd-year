package packWork;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BmpImage extends Image {
	
    static {
        System.out.println("BmpImage class loaded");
    }

    public BmpImage (String imagePath) throws IOException {
        super(imagePath);
    }
    
    @Override
    public BufferedImage processImage() {
        return this.image;
    }
}

