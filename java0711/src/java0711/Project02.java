package java0711;

import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		boolean run = true;
		//boolean run2 = true;
		int stNum =0;
		
		Scanner sc = new Scanner(System.in);
		oul:
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------");
			int menuNum = Integer.parseInt(sc.nextLine());
			switch(menuNum) {
			case 1:
				System.out.println("로그인처리");
				System.out.print("아이디:");
				String id = sc.nextLine();
				
				System.out.print("패스워드:");
				String strPass = sc.nextLine();
				int pass = Integer.parseInt(strPass);
				
				if(id.equals("java")) {
					if(pass == 12345){
						System.out.println("로그인 성공");
					}	else {
						System.out.println("로그인 실패: 패스워드가 틀림");
						
					}
				}else {
					System.out.println("로그인 실패 : 아이디 존재하지않음 ");
					
				}break;
				
			case 2:
				System.out.println("회원가입");
				System.out.println("[필수 정보 입력]");
				System.out.print("1.이름:");
				String strid = sc.nextLine();
				System.out.print("2.주민번호 앞자리 6자:");
				stNum +=Integer.parseInt(sc.nextLine());
				System.out.print("3.전화번호:");
				String Ph = sc.nextLine();
				
				System.out.println("[입력된 정보]");
				System.out.println("이름:"+ strid);
				System.out.println("주민번호 앞자리 6자: "+ stNum);
				System.out.println("전화번호 : "+ Ph);
				
				break;
				
			case 3:
				int bal =0;
				boolean run2 = true;
				while(run2) {
					System.out.println("-------------------------");
					System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
					System.out.println("-------------------------");
					int menuNum2 = Integer.parseInt(sc.nextLine());
					switch(menuNum2) {
					case 1:
						System.out.print("예금>");
						bal +=Integer.parseInt(sc.nextLine());
						break;
					case 2:
						System.out.print("출금>");
						bal -=Integer.parseInt(sc.nextLine());
						break;
					case 3:
						System.out.print("잔고>");
						System.out.println(bal);
						break;
					case 4:
						System.out.println("퇴장");
						continue oul;											
					}
												
			}case 4:
				run = false;
				break;
		}

	}

}
}
