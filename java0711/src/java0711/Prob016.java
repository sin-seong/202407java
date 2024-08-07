package java0711;

import java.util.Scanner;

public class Prob016 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		
		do {
			System.out.print("n의값:");
			n = sc.nextInt();
		}while(n < 10|| n >99);
		
		System.out.println(n);
		

	}

}
