package java0710;
import java.util.Scanner;
public class Prob006 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.printf("원하는 수의 단 :");
		String input = sc.nextLine();
		int x = Integer.parseInt(input);
		System.out.printf("***"+x+"단***\n");
		for(int z=1; z<=9; z++) {
			System.out.printf(x+"x"+ z +"="+(x*z)+"\n");
		}
		
		

	}

}
