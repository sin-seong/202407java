package java0709;
import java.util.Scanner;
public class Prob05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오:");
		String input = sc.nextLine();
		int x = Integer.parseInt(input);
		
		switch(x/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			
			System.out.println("F학점");
		
		}
	}

}
