package java0725;

class MyClass{
	void method() throws MyException{
		int x = 100;
		if (x >90) {
		throw new MyException("ㄴㅁ예외");
	}
	
}
}
public class MyException1 {

	public static void main(String[] args) {
		MyClass mc =new MyClass();
		try {
		mc.method();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}
}

