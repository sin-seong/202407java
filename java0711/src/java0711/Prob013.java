package java0711;

import java.util.Scanner;

public class Prob013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n;
		do {
			System.out.printf("수를입력 하시오:");
			n = sc.nextInt();
		}while (n <= 0);
		
		for(int i=1; i <= n; i++) { 
			if(i < n) {
			System.out.print(i +"+");//i가 n보다작을 참일경우 숫자 하나 찍힐떄마다 숫자에 + 나옴
			}else {					//거짓일경우 이퀄을 냄
				System.out.print(i+"=");
			}
			sum +=i;
				
		}System.out.println(sum);//print<로 써서 문단 넘기기없
		
	
	
		}
		
	

}
