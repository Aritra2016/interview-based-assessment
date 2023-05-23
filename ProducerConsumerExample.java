package Ques_09;
import java.util.Queue;
import java.util.LinkedList;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		
		 Queue<Integer> queue = new LinkedList<>();

	        Producer producer = new Producer(queue);
	        Consumer consumer = new Consumer(queue);

	        producer.start();
	        consumer.start();
		

	}

}
