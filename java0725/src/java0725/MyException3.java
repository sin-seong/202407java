package java0725;

class MyClass2{
	void method() throws MyException2{
		throw new MyException2("ㄴㅁㅇㄴ");
	}
	
}
public class MyException3 {

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
