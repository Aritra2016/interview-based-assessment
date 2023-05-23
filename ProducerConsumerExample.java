package Ques_09;

import java.util.Queue;
import java.util.LinkedList;

public class ProducerConsumerExample {

	private static final int MAX_QUEUE_SIZE = 10;
    private static final int NUM_PRODUCERS = 3;
    private static final int NUM_CONSUMERS = 2;

    private static Queue<Integer> queue = new LinkedList<>();
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread[] producerThreads = new Thread[NUM_PRODUCERS];
        Thread[] consumerThreads = new Thread[NUM_CONSUMERS];

        // Create and start producer threads
        for (int i = 0; i < NUM_PRODUCERS; i++) {
            producerThreads[i] = new ProducerThread();
            producerThreads[i].start();
        }

        // Create and start consumer threads
        for (int i = 0; i < NUM_CONSUMERS; i++) {
            consumerThreads[i] = new ConsumerThread();
            consumerThreads[i].start();
        }

        // Wait for all producer threads to finish
        try {
            for (int i = 0; i < NUM_PRODUCERS; i++) {
                producerThreads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for all consumer threads to finish
        try {
            for (int i = 0; i < NUM_CONSUMERS; i++) {
                consumerThreads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	
    }
}
