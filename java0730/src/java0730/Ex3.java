package java0730;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex3 {
	public static void main(String[] ar) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ken",100));
		list.add(new Student("Shin",60));
		list.add(new Student("Kim",80));
		
		Collections.sort(list, (s1,s2)->Integer.compare(s1.getScore(), s2.getScore()));
		//객체 배열 Arrys.sort사용
		//		System.out.println(list);
		
		
		list.stream().forEach(s->{
//			System.out::println();
			System.out.println(s.getName()+ ", "+s.getScore());
		});
	}
}
