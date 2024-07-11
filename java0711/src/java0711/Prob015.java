package java0711;

import java.util.Scanner;

public class Prob015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , w;
		do {
		System.out.print("n의 수입력:");
		n = sc.nextInt();
		}while(n<=0);
		do {
		System.out.print("w의 수:");
		w = sc.nextInt();
		}while(w <= 0 || w > n);
		
//		for(int i=0; i<n; i++) {
//			System.out.print("*");
//			if(i % w == w-1){// i를 w로 나눈 나머지 -1
//				System.out.printf("\n");
//			}
//						
//		}if(n % w != 0) {
//			System.out.println();
//		}
//		System.out.println("완료");

		for(int i = 0; i < n / w; i++)
			System.out.println("*".repeat(w));
		
		int rest = n % w;
		if(rest != 0)
			System.out.println("*".repeat(rest));
		
	}

}
