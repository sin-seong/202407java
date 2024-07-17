package sec06.exam03.package2;

import sec06.exam03.package1.A;

public class C {
	A a;// 디폴트 뭐시기는 패키지가 다르면 안된다
	
	void method() {
		a.x = 200;
	}
}
