package java0725;

public class Ex3 {

	public static void main(String[] ar) {
		String s1 = ar[0];
		System.out.println(s1);
		int num = 0;
		try {
			num = Integer.parseInt(s1);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("정수 입력:");
		}
	}
}
