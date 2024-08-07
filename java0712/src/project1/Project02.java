package project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Project02 {

	public static void main(String[] args) {
		boolean run = true;
		
		Member  member = null;
		Member[] list = {
				new Member("강하나", "911224", "010-1234-5678"),
				new Member("김하나", "891224", "010-1234-2313"),
				new Member("이하나", "901224", "010-7890-5678")
		};
		try(FileInputStream fis =new FileInputStream("c:\\temp\\members.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			list= (Member[]) ois.readObject();
			System.out.println("파일에서 객체를 가져왔습니다");
				}catch (IOException | ClassNotFoundException e){
					e.printStackTrace();
				}
		
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("----------------------------------");
			int menuNum = Integer.parseInt(sc.nextLine());
			switch(menuNum) {
			case 1:
				System.out.println("로그인처리");
				System.out.print("아이디:");
				String id = sc.nextLine();
				
				System.out.print("패스워드:");
				String strPass = sc.nextLine();
				
				int find =-1;
				
				for(int i =0; i< list.length; i++) {
					if(list[i].name.equals(id)) {
						find = i ;
						if(list[i].ssn.equals(strPass)) {
						System.out.println("로그인 성공");
					}	else {
							System.out.println("로그인 실패: 패스워드가 틀림");
					}	
					}else {
					System.out.println("로그인 실패 : 아이디 존재하지않음 ");
				}
						break;
					}
								
				
					break;
				
			case 2:
				System.out.println("회원가입");
				System.out.println("[필수 정보 입력]");
				
				System.out.print("1.이름:");
				String name2 = sc.nextLine();
				System.out.print("2.주민번호 앞자리 6자:");
				String ssn =sc.nextLine();
				System.out.print("3.전화번호:");
				String tel = sc.nextLine();
				System.out.println();
				System.out.println("[입력된 정보]");
				System.out.println("이름:"+ name2);
				System.out.println("주민번호 앞자리 6자: "+ ssn);
				System.out.println("전화번호 : "+ tel);
				
				member = new Member(name2, ssn, tel);
				
				
				break;
				
			case 3:
				System.out.println("예금 출금");
				boolean run2 = true;
				
				while(run2) {
					System.out.println("-------------------------");
					System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
					System.out.println("-------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(sc.nextLine());
					switch(menuNum2) {
					case 1:
						System.out.print("예금>");
						member.bal +=Integer.parseInt(sc.nextLine());
						break;
					case 2:
						System.out.print("출금>");
						member.bal -=Integer.parseInt(sc.nextLine());
						break;
					case 3:
						System.out.print("잔고>");
						System.out.println(member.bal);
						break;
					case 4:
						System.out.println("퇴장");
						run2 =false;
						break;											
					}
												
			}
			case 4:
				
				try(FileOutputStream fos =new FileOutputStream("c:\\temp\\members.dat");
						ObjectOutputStream oos = new ObjectOutputStream(fos)) {
					
					oos.writeObject(list);
					System.out.println("객체를 파일에저장했습니다");
					
				}catch (IOException e) { 
					e.printStackTrace();
					
					
				run = false;
				break;


			}
								
			
		}

	}

}
}
