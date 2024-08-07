package sec01.exam07;

public class MainTreadExample {
public static void main (String[] ar) {
	Calculator calculator = new Calculator();
	
	User1 user1 = new  User1();
	user1.setCalcualtor(calculator);
	user1.start();
	
	User2 user2 = new User2();
	user2.setCalcualtor(calculator);
	user2.start();
}
}
