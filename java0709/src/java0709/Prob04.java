package java0709;

import java.util.Scanner;

public class Prob04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번쨰 수 입력:");
		String input = sc.nextLine();
		int x = Integer.parseInt(input);
		
		System.out.print("두번째 수 입력:");
		input = sc.nextLine();
		int y = Integer.parseInt(input);
		
		System.out.print("세번째 수 입력:");
		input = sc.nextLine();
		int z = Integer.parseInt(input);
	
		int max = x;
		
		if (y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
	System.out.println("최대값은 "+ max +"입니다");
		
	}
}
