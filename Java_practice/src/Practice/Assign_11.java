package Practice;

 
import java.time.LocalTime;

class TimePrinter implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Current time: " + LocalTime.now());
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Assign_11 {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(new TimePrinter());
        daemonThread.setDaemon(true);  // Mark as daemon thread
        daemonThread.start();

        try {
            Thread.sleep(5000);  // Main thread sleeps for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread ending, daemon thread will stop too.");
    }
}

