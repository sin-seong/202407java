package java0711;

import java.util.Scanner;

public class Prob0131 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n;
		do {
			System.out.printf("수를입력 하시오:");
			n = sc.nextInt();
		}while (n <= 0);
		
		for(int i=1; i < n; i++) { 
			System.out.print(i + "+");
			sum += i;
				
		}
		System.out.print(n+"=");
		sum += n;
		System.out.println(sum);

	}

}
