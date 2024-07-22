package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	

	@Override
	public void run() {
		Toolkit tookit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			tookit.beep();
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}// TODO Auto-generated method stub
		
	}

		}
}
