package p299;

public class ClassName {
	int field1;
	void method1() {
		ClassName.field2 = 200;
		this.field1 =300;
	} // 스태틱이없기에 인스턴스 필드  객체 생성이 되어야 소속이 됨
	
	static int field2;
	static void method2() {
		
	}//이것들은 정적필드
	
	public static void main(String... ar) {
//		method2();
		ClassName.method2();
		System.out.println(ClassName.field2);
		ClassName c1 = new ClassName();
		c1.method1();
		System.out.println(c1.field1);
		
		
	}
}
