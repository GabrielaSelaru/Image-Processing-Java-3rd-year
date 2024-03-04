package packWork;
/*
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;

import javax.imageio.ImageIO;

public class WriterResult {
	 private PipedInputStream inputPipe;

	    public WriterResult(PipedInputStream inputPipe) {
	        this.inputPipe = inputPipe;
	    }

	    public void receiveAndWriteImage(String outputPath) {
	        try {
	        	ObjectInputStream objectInputStream = new ObjectInputStream(inputPipe);
	            String tempFilePath = (String) objectInputStream.readObject();
	            File tempFile = new File(tempFilePath);

	            BufferedImage processedImage = ImageIO.read(tempFile);

	            ImageIO.write(processedImage, "bmp", new File(outputPath));
	            System.out.println("Image received and written by WriterResult");
	            tempFile.delete();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}*/

import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class WriterResult {
 
    public void receiveAndWriteImage(String outputPath) {
        try {
        	long startTimeWriting = System.currentTimeMillis();
        	System.out.println("Inceputul metodei receiveAndWriteImage");
        	ImageData imageData = new ImageData();
            Image image = imageData.getImage();
            BufferedImage processedImage = image.processImage();
            ImageIO.write(processedImage, "bmp", new File(outputPath));
            long endTimeWriting = System.currentTimeMillis();
            System.out.println("Timp pentru scrierea fisierului destinatie: " + (endTimeWriting - startTimeWriting) + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
