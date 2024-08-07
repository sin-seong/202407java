package java0709;

public class Swap {
	/**
	 * @param a
	 * @param b
	 * @since 1.1.0
	 */
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("x=%d, y=%d\n", a ,b);
	}

	public static void main(String[]args) {
		int x = 10;
		int y = 20;
		
		System.out.printf("x=%d, y=%d\n", x ,y);
		swap(x,y);
		//int temp = x;
		//x = y;
		//y = temp;
		System.out.printf("x=%d, y=%d\n", x ,y);
	}
}
