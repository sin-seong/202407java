package project1;

import java.awt.List;

public class Ex2 {

	public static void main(String[] args) {
		Member mb =null;
		Member[] list = {
				new Member("강하나", "911224", "010-1234-5678"),
				new Member("김하나", "891224", "010-1234-2313"),
				new Member("이하나", "901224", "010-7890-5678")
		};
		for (Member member : list) {
			System.out.println(member);
		}
		int find =-1;
		
		for(int i =0; i< list.length; i++) {
			if(list[i].name.equals("김하나")) {
				find = i ;
				break;
			}
		}
		System.out.println("인덱스:"+find);
		System.out.println(mb);

	}

}
