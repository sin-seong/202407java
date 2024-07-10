package java0710;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int y = 0;
		int z = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("\n--------------------------------");
			System.out.println("1.예금 | 2. 출급 | 3.잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.printf("선택> ");
			String input = sc.nextLine();
			int x = Integer.parseInt(input);
			
			
			switch(x) {
			case 1:
				System.out.printf("예금액> ");
				input = sc.nextLine();
				y += Integer.parseInt(input);
				balance += Integer.parseInt(input);
				
				break;
				
			case 2:
				System.out.printf("출금액> ");
				input = sc.nextLine();
				int wid = Integer.parseInt(input);
				z += wid;
				balance -= wid;
				
				break;
				
			case 3:
				balance = y - z;
				System.out.printf("잔고> %d " , balance);
							
				break;
				
				
			case 4:
				System.out.println("프로그램 종료");
				run = false;	
				break;
			}
		}
		sc.close();
	}

}
