package Ques_09;
import java.util.Queue;
import java.util.Random;


public class Producer extends Thread {
	
	private Queue<Integer> queue;
    private Random random;

    public Producer(Queue<Integer> queue) {
        this.queue = queue;
        this.random = new Random();
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (queue) {
                    int number = random.nextInt(100);
                    queue.offer(number);
                    System.out.println("Produced: " + number);
                    queue.notify();  // Notify the consumer thread
                }

                Thread.sleep(1000);  // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
