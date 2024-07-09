package java0709;
import java.util.Scanner;
public class Prob06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요:");
		String input = sc.nextLine();
		long x = Long.parseLong(input);
		//두인이는 양양이다
		if(x > 0) {
			System.out.printf("%d\n", x);
		}else{
			System.out.printf("%d",x*-1);
		}
			
		}

	}
