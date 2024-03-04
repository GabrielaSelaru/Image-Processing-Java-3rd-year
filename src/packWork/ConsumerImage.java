package packWork;

import java.awt.image.BufferedImage;
import java.io.IOException;


public class ConsumerImage extends Thread{
	
	private ImageData imageData;
    
	public ConsumerImage(ImageData imageData) {
	      this.imageData = imageData;
	}

	@Override
	public void run() {
	    try {
	    	long startTimeProcessing = System.currentTimeMillis();
	    	Image image = imageData.getImage();
	        BufferedImage processedImage = image.processImage();
	        long endTimeProcessing = System.currentTimeMillis();
	        System.out.println("Timp pentru procesarea imaginii: " + (endTimeProcessing - startTimeProcessing) + " ms");
	    }finally{
	    }
	}
}