package java0711;

import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		Scanner sc =new Scanner(System.in);
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------");
			int menuNum = Integer.parseInt(sc.nextLine());
			switch(menuNum) {
			case 1:
				System.out.println("1");
				balance +=Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("2");
				balance -=Integer.parseInt(sc.nextLine());
				break;
			case 3:
				System.out.println("3");
				System.out.println(balance);
				break;
			case 4:
				System.out.println("4");
				run =false;
				break;
			}
		}System.out.println("프로그램 종료");
		
	}

}
