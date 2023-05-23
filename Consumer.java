package Ques_09;
import java.util.Queue;

public class Consumer extends Thread{

	 private Queue<Integer> queue;

	    public Consumer(Queue<Integer> queue) {
	        this.queue = queue;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	                synchronized (queue) {
	                    while (queue.isEmpty()) {
	                        queue.wait();  // Wait until there is an element in the queue
	                    }

	                    int number = queue.poll();
	                    System.out.println("Consumed: " + number);
	                    int sum = calculateSum(queue);
	                    System.out.println("Sum: " + sum);
	                }

	                Thread.sleep(1000);  // Sleep for 1 second
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    private int calculateSum(Queue<Integer> queue) {
	        int sum = 0;
	        for (int number : queue) {
	            sum += number;
	        }
	        return sum;
	    }
	
	
	
}


