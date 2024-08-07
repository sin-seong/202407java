package java0711;

import java.util.Scanner;

public class Prob011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		do {
			System.out.printf("수를입력 하시오:");
			n = sc.nextInt();
		}while (n <= 0);
		
		for(int i=1; i <= n; i++) {
			sum +=i;
		}
		System.out.printf("1부터" + n +"까지의 총합은:%d"+"입니다." ,sum );
		

	}

}
