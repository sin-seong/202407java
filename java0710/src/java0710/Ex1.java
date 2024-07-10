package java0710;

public class Ex1 {
	public static void main(String[]args) {
		String str1 = 10+"";
		String str2 = String.valueOf(10);
		System.out.println(str2);
		
		
		double st12 =Double.parseDouble("100.345")+3;
		System.out.println(st12);
		
		String st1 = " 가나다 " + 3;
		System.out.println(st1);
		
		String st2 = 3 + "가나다";
		System.out.println(st2);
		
		int x1 = 1; 
		int y1 = 3;
		int x3 = x1/ y1;  // 몫 계산
		System.out.println(x3);
		
		double res3 = (double)x1 / y1 ;
		System.out.println(res3);
		
		byte a1 =10;
		byte b2 = 20;
		byte c3 = (byte) (a1 + b2);
		int s1 = a1 + b2;
		
		float result = 1.5f + 3.4f;
		double res2 = 1.5 + 3.4;
		
		
		byte b1 = 65;
		char c1 = (char) b1; //char은 -를 받아드릴수없어 문자가 깨질수있음 
		System.out.println(c1);
		
		int x = 128;
		byte y = (byte) x;
		System.out.println(y);
		
		double d1 = 3.14;
		int z = (int) d1;
		System.out.println(z);
		
		
	}

}
