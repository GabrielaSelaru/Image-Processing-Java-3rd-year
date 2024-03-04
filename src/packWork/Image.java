package packWork;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public abstract class Image {
	
	protected BufferedImage image;
	
	{
		System.out.println("Image class loaded");
	}
	
	 public Image(String imagePath) throws IOException {

	        this.image = ImageIO.read(new File(imagePath));
	    }

	    public abstract BufferedImage processImage();

	    public void saveImage(String path) throws IOException {
	        File outputFile = new File(path);
	        ImageIO.write(this.image, "bmp", outputFile);
	    }
	}
