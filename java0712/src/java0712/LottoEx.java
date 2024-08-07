package java0712;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoEx {

	public static void main(String[] args) {
		//int[] lotto = new int[6];
		Random rd =new Random();
		Set<Integer> lottoSet = new HashSet<>();// 중복을 허용하지않는 set 사용
		
		while(lottoSet.size() <6) {//사이즈가 6이 될때까지
			int number = rd.nextInt(45)+1;
			lottoSet.add(number);
		}
		
//		lottoSet.add(1);
//		lottoSet.add(5);
//		lottoSet.add(1);
//		System.out.println(lottoSet.size());
		System.out.println(lottoSet);

	}

}
