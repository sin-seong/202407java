package java0729;

public class ThreadEx1 {

	public static void main(String[] args) {
	Thread mTread = Thread.currentThread();
	System.out.println(mTread.getName());
	
	
	Thread threadA = new ThreadA();
	threadA.start();
	
	Thread threadB = new Thread() {

		@Override
		public void run() {
			for(int i = 0; i < 2; i++)
				System.out.println(this.getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	};
	
	threadB.setName("ThreadB");
	threadB.start();
	
	
	Thread threadC = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i = 0; i < 2; i++)
				System.out.println("threadC");
			try {
				Thread.sleep(100);	
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			
			
		}
	});
	}

}
