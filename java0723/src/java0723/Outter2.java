package java0723;

public class Outter2 {

		String field = "Outter-field";
		void method() {
			System.out.println("Outter=method");
		}
		class Nested{
			String field = "Nested-field";
			void method() {
				System.out.println("Nested=method");
			}
			
			void print() {
				System.out.println(this.field);
				this.method();
				System.out.println(Outter2.this.field); // 바깥것을 쓰려면 바깥거 적으면됨
				Outter2.this.method();
			}
		}
}
