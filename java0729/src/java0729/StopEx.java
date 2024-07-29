package java0729;

public class StopEx {

	public static void main(String[] args) {
		PrintThread1 printThread1 = new PrintThread1();
		printThread1.start();
		
		try {
			Thread.sleep(500);	
		} catch (Exception e) {			// TODO: handle exception
		}		printThread1.setStop(true);

	}

}
