package packWork;

public class ImageData {
	private Image image;
    private boolean available = false;

    public synchronized Image getImage() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e);
            }
        }
        available = false;
        notify();
        return image;
    }

    public synchronized void setImage(Image image) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e);
            }
        }
        this.image = image;
        available = true;
        notify();
    }
}
