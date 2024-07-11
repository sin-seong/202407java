package java0711;

import java.util.Scanner;

public class Prob010 {
	public static int med(int x, int y, int z) {
		if((y >=x && z <= x) || (y <= x && z >= x)) {
			return x; 
		}else if((x > y && z < y) || (x < y && z > y)) {
			return y;
		}
		return z;
		}
	
//		if(x >= y) {//x가 크면 바로 아래꺼 구동
//			if(y >= z) {
//				return y;
//			}else if(x <= z) {
//				return x;
//			}else {
//				return z;
//			}
//		}else if (x > z) {//x가 y보다 낮으면 여기쪽 
//			return x;
//		}else if (y > z) {
//			return z;
//		}else {
//			return y;
//		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("첫번째 수를 입력: ");
		int x = sc.nextInt();
		
		System.out.printf("두번째 수를 입력: ");
		int y = sc.nextInt();
		
		System.out.printf("세번쨰 수를 입력: ");
		int z = sc.nextInt();
		
		
		
		System.out.println(med(x, y, z));
	
}
}
//		if(x >= y) {//x가 크면 바로 아래꺼 구동
//			if(y >= z) {
//				System.out.println(y);
//			}else if(x <= z) {
//				System.out.println(x);
//			}else {
//				System.out.println(z);
//			}
//					
//		}else if (x > z) {//x가 y보다 낮으면 여기쪽 
//			System.out.println(x);
//		}else if (y > z) {
//			System.out.println(z);
//		}else {
//			System.out.println(y);
//		}

	
