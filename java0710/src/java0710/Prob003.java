package java0710;

public class Prob003 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) {
				System.out.printf("1~10사이의 짝수는 :%d\n",i);
				sum +=i;
			}
			
		}System.out.printf("1~10사이의 짝수의합 :%d\n",sum);	

	}

}
