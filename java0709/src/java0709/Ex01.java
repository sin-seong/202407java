package java0709;

public class Ex01 {

	public static void main(String[] args) {
		//byte x =126;
		//short a2 = 32767;
		int y = 20;
		int x = 10;
		System.out.println("x:"+ x + ",y:" + y );
 		//System.out.println(y);
		//long a2 = 2000000000l;
		//char var1 = '델'+1;
		//System.out.println(var1);
		//System.out.println(var1+1);
		//System.out.printf("%d\n",y);
		//System.out.printf("%c",var1);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:"+ x + ",y:" + y );
		
	}

}
