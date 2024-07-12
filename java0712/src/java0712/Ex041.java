package java0712;

import java.util.Scanner;

public class Ex041 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("학생수 입력 :");
		int num =Integer.parseInt(sc.nextLine()); 
		double score[][] =new double[num][3];
		
		
		for(int i =0; i<score.length; i++) {
			System.out.println(i+"번쨰 학생\n");
			System.out.print("국어 점수:");
			score[i][0]=Double.parseDouble(sc.nextLine());
			System.out.print("수학 점수:");
			score[i][1]=Double.parseDouble(sc.nextLine());
			
			score[i][2] =(score[i][0]+(score[i][1]))/2;
			
			
		}
			
		System.out.println("\t국어\t수학\t평균");
		System.out.println("==============================");
		for(int i =0; i<=score.length; i++) {
			
			System.out.printf("%d번 학생\t%3.2f\t%3.2f\t%3.2f\t\n",i+1, score[i][0],score[i][1],score[i][2]);
			System.out.println("==============================");
		}
	}
}
	


