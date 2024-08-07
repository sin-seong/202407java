package java0729;

public class InterruptedEx2 extends Thread {

	public static void main(String[] args) {
		PrintThread2 printThread2 = new PrintThread2();
		printThread2.start();
		
		try {
			Thread.sleep(500);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		printThread2.interrupted();

	}

}
