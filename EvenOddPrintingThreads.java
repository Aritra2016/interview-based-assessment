package Ques_08;

public class EvenOddPrintingThreads {

	public static void main(String[] args) {
		
		Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread oddThread = new Thread(new OddNumberPrinter());

        evenThread.start();
        oddThread.start();
		
		

	}

}
