package java0729;

public class ThreadA extends Thread{

	public ThreadA() {
		this.setName("Thread");
		
	}
	@Override
	public void run() {
		for(int i = 0; i < 2; i++)
			System.out.println(getName());
		super.run();
	}

	
	}

