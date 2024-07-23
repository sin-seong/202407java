package thread2;

public class Th1 extends Thread {//런네이블 인터페이스 생성

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("삐");
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				e.printStackTrace();
		}
	
		
		}
	}}