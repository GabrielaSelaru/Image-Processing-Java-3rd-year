package packTest;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Scanner;
import packWork.ImageData;
import packWork.Producer;
import packWork.ConsumerImage;
import packWork.WriterResult;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long startTimeFilePaths = System.currentTimeMillis();
        System.out.println("Introduceti calea catre imaginea sursa:");
        String imagePath = scanner.nextLine();

        System.out.println("Introduceti calea pentru salvarea imaginii procesate:");
        String outputPath = scanner.nextLine();
        long endTimeFilePaths = System.currentTimeMillis();
        System.out.println("Timp pentru citirea cailor fisierelor: " + (endTimeFilePaths - startTimeFilePaths) + " ms");

        
        try {
            ImageData imageData = new ImageData();

            Producer producer = new Producer(imageData, imagePath);
            ConsumerImage consumer = new ConsumerImage(imageData);
            WriterResult writerResult = new WriterResult();

            producer.start();
            consumer.start();

            producer.join();
            consumer.join();
            
            writerResult.receiveAndWriteImage(outputPath);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }  
}
