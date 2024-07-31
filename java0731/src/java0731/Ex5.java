package java0731;

import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
	List<Member> list = Arrays.asList(
			new Member("홍길동",Member.MALE,30),
			new Member("청길남",Member.MALE,20),
			new Member("적길동",Member.MALE,45),
			new Member("자길두",Member.MALE,27));

	
	double avg = list.stream().mapToInt(a->a.getAge()).average().orElse(0);
	System.out.println(avg);
	
	double avg1 = list.stream()
			.filter(x->x.getSex()==Member.MALE)
			.mapToInt(a->a.getAge())
			.average().orElse(0);
	System.out.println(avg1);
}
}
