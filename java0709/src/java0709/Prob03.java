package java0709;
import java.util.Scanner;
public class Prob03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int z = 0;
		System.out.print("첫번쨰 수 입력:");
		String input = sc.nextLine();
		int x = Integer.parseInt(input);
		
		System.out.print("두번째 수 입력:");
		input = sc.nextLine();
		int y = Integer.parseInt(input);
		
		if(x > y) {
			System.out.println("큰값은" + x +"입니다.");
		}else if(x == y) {
			System.out.println("동일값이여서 " + 0 + "이 출력됩니다");
		}else {
			System.out.println("큰값은" + y + "입니다.");
		}
		

	}
}
