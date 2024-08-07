package java0711;

import java.util.Scanner;

public class Prob012 {
	public static int sumOf(int a, int b) {
//		int sum = 0;
//		for(int i = a; i<=b; i++) {
//			sum += i;
//		}
//		return sum;
//	}

		int min; //a,b의 작은쪽 값
		int max; //a,b의 큰쪽 값
		
		if(a < b) {
			min = a; max = b;
		}else {
			min = b; max = a;
		}
		int sum = 0;
		for (int i =min; i<= max; i++) {
			sum += i;
		}return sum;
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("a의값:");
		int a = sc.nextInt();
		System.out.printf("b의값:");
		int b = sc.nextInt();
		
		System.out.println(sumOf(a,b));

	}

}
