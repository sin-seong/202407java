package java0711;

import java.util.Scanner;

public class Prob014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.print("수:");
		n =sc.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++) {
			if(i%2!=0) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
	}

}
