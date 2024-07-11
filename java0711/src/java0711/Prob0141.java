package java0711;

import java.util.Scanner;

public class Prob0141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.print("수:");
		n =sc.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n/2; i++) {
			System.out.print("+-");
		}
		if(n%2 !=0)
			System.out.print("+");
		}
	}


