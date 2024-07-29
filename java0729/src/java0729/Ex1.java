package java0729;

import java.util.Date;

class Aa{
	@Override
	public String toString() {
		return "Aa [ss=" + ss + "]";
	}

	String ss = "Aa 클래스"; 
	
}

public class Ex1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1);
//		System.exit(0); 506p 나중에 해보기 절대경로 탐색
		System.out.println(obj2);
		Aa aa = new Aa();
		System.out.println(aa);
		Class clazz = Aa.class;
		System.out.println(clazz.getName());
	}

}
