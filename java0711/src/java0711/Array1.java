package java0711;

public class Array1 {

	public static void main(String[] args) {
		int score[]= {83,90,87};// 배열 이름만 만든거고 배열 데이터가 존재하는 방은 안만듬
		int score2[] = new int[] {83,90,83};//위아래 같은 거임
		double sum =0.0;
		double avg = 0;
		for(int i =0; i <score.length; i++) {
			sum += score[i];
			avg = sum/score.length;
		
//		System.out.println(score[4]);
//		System.out.println(score[score.length-1]); //배열크기를 오버하거나 length를 쓸경우 -1 해야함
			
		}System.out.printf("총점:\n"+sum);
		System.out.printf("평균:"+avg);
		
		int myArr[] = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println(myArr[i]);  //배열의 생성 (초기화)
		}
	
		double myArr2[] = new double[5];
		for(int i=0; i<5; i++) {
			System.out.println(myArr2[i]);
	}
	}
}


