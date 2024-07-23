package thread2;

public class Ex1 {

		public static void main(String[] args) {
//			Thread thread = new Thread(new Th1());
			Th1 th1 = new Th1();
			th1.start();// run말고 start 로돌려야함

			
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try {
				Thread.sleep(500);
			}catch (Exception e) {
				e.printStackTrace();		}
		}
	}
}