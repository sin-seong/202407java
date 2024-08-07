package p303;

public class Person {
	
	final String nation = "Korea"; // final 붙으면 값 변경 불가
	static final double PI = 3.147592;
	public static void main(String[] ar) {
		Person p1 = new Person();
//		p1.nation = "USA";//< 그래서 안됨
//		PI =3.14;
		System.out.println(p1.nation);
	}
}
