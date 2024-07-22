package java0722;

public class A {
	class B {
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
	}
	public static void main(String[] ar) {
		
	A a = new A();
	A.B b = a.new B();
	b.method1();
	}
}
