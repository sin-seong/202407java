package thread;

import java.awt.Toolkit;

public class BeepEx1 {
	public static void main(String[] ar){
		Toolkit tookit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			tookit.beep();
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			tookit.beep();
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
		
		}
		
	}
}
}
