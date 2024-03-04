package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class GrayScaleImage  extends BmpImage implements ImageProcessor{
    
	public GrayScaleImage(String imagePath) throws IOException {
        super(imagePath);
    }

    @Override
    public BufferedImage processImage() {
        
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = image.getRGB(x, y);
                int grayLevel = (int)(0.3 * ((rgb >> 16) & 0xff) + 0.59 * ((rgb >> 8) & 0xff) + 0.11 * (rgb & 0xff));
                int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel;
                grayImage.setRGB(x, y, gray);
            }
            }
        return grayImage; 
    }
}
