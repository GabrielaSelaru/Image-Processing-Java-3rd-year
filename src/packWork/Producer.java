package packWork;

import java.io.IOException;

public class Producer extends Thread {
    private ImageData imageData;
    private String imagePath;

    public Producer(ImageData imageData, String imagePath) {
        this.imageData = imageData;
        this.imagePath = imagePath;
    }

    @Override
    public void run() {
        try {
        	long startTimeRead = System.currentTimeMillis();
            Image image = new GrayScaleImage(imagePath); 

            imageData.setImage(image);
            long endTimeRead = System.currentTimeMillis();
            System.out.println("Timp pentru citirea fisierului sursa: " + (endTimeRead - startTimeRead) + " ms");
            Thread.sleep(1000); 
            
        } catch (IOException | InterruptedException e) {
            System.out.println("Exception in Producer: " + e.getMessage());
        }
    }
}
