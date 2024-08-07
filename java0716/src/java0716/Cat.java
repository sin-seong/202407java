package java0716;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@AllArgsConstructor
@ToString
public class Cat {

	private String breed;
	private String color;
	private int age = 10;
	
//	@Override  //<  재 정의
//	public String toString() {
//		return "고양이 [품종=" + breed + ", 색깔=" + color + ", 나이=" + age + "]";
//	}

//	public Cat(String breed) {
//		
////		this.bread = bread;
//		this(breed, "흰색" ,10);
//	}
//
//	public Cat(String breed, String color) {
////		super();
////		this.bread = bread;
////		this.color = color;
//		this(breed, color,10);
//	}
//
//	public Cat(String breed, String color, int age) {
//		super();	//this. super.
//		this.breed = breed;
//		this.color = color;
//		if(age > 9){
//			this.age = age;
//		}
//	}
//
//	Cat(){	
//		System.out.println("Cat");
//	}
//	
//		
//	Cat(int age) {// 생성자
//		
//	}

}
