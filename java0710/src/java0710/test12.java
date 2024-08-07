package java0710;

public class test12 {

	public static void main(String[] args) {
		int sum= 0;
		int i=1;
		do{
			if(i%2 ==0) {
				System.out.println(i);
				sum+= i;
			}
		i++;
		}while(i<=100); //do-whlie문은 무조건 한번은 실행하게 하기위한 용도
	}

}
	
