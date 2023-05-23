package Ques_08;

 class OddNumberPrinter implements Runnable {
	 
	 @Override
	    public void run() {
	        for (int i = 1; i <= 9; i += 2) {
	            System.out.println("Odd: " + i);
	        }
	    }

}
