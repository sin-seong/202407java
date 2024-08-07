package java0710;

public class Prob002 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			// 이 안쪽에 넣으면 같이 반복되기떄문에 100번 다 출력됨
		}
		System.out.printf("1~100까지의 합:%d\n",sum);//바깥에 둬야 끝수를 출력
	}

}
