package java0710;

import java.util.Scanner;

public class Prob007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("명령>>");
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("q")) {//equals(=<<)Ignore Case(대소문자 구분없)
				break;
			}
		}
		System.out.println("종료!");
	}

}
