package thread;

import java.awt.Toolkit;

public class BeepEx2 {
	public static void main(String[] ar){
		
		Thread trThread = new Thread(new BeepTask());
		trThread.start();
		
			
		for(int i=0; i<5; i++) { //메인 스레드
			System.out.println("띵");
			
			try {
				Thread.sleep(500); //1000 > 1초
			}catch (InterruptedException e) {
				e.printStackTrace();
		
		}
		
	}
}
}
