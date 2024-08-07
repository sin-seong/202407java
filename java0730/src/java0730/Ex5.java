package java0730;

import java.util.stream.IntStream;

public class Ex5 {

	public static void main(String[] args) {
//		IntStream ii = IntStream.range(1, 5);
//		IntStream ii2 = IntStream.rangeClosed(1, 5);
//		ii.forEach(System.out::Println);
//		ii2.forEach(a->{
//			System.out.println(a);
//		});
		int count = 10;
		
		int sum = IntStream.rangeClosed(1,count).sum();
		System.out.println("합"+ sum);	
		};
	}

