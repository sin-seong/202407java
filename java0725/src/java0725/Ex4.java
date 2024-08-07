package java0725;

public class Ex4 {
	
	public static void method() throws ClassNotFoundException {
		
		Class.forName("쿠쿠르를.으으으으.ㄹ르르르");
	}
	public static void main(String[] ar) throws ClassNotFoundException {
		try {
			method();	
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
