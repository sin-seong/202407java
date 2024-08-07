package java0710;

public class Prob004 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			
			if(i%2 != 1) {
				sum = sum + i;
				continue;
			}
		System.out.printf("1~100까지 짝수의합계:%d\n",sum);
		}//? 맞나?

	}

}
