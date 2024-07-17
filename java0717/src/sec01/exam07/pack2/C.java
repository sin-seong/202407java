package sec01.exam07.pack2;

import sec01.exam07.pack1.A;  

public class C extends A {
	public void method() {
		this.field = "value";
		method();
		 // new 연산자 사용해서 생성자를 호출할수없고 super()이용해서 a로 호출은가능
//		A a = new a(); << 안되는거임
	}
}
