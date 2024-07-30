package java0730;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("ken",100));
		list.add(new Student("shin",68));//배열 2칸이라
		list.add(new Student("kim",96));
		
//		long sum = list.stream().filter(s->s.getScore() >=70).();
//		System.out.println("70점 이상은 "+ sum + "명");
		
		long num = list.stream().filter(s->s.getScore() >=70).count();
		System.out.println("70점 이상은 "+ num + "명");
		
		
		list.stream()
		.filter(s->s.getScore() >=70)
		.forEach(s->System.out.println(s.getName()));
//		for(int i =0; i<list.size(); i ++) {
//			if(list.get(i).getScore()< 70) {
//				list.remove(i);
//			
//			}
//		}
		
		list.stream().forEach(a->{
			String msg = MessageFormat.format("{0},{1}",a.getName(),a.getScore());
			System.out.println(msg);});
		
		
//		for(Student st : list) {//	아래 내용이 2칸만 쓰기
//			String msg = MessageFormat.format("{0},{1}",st.getName(),st.getScore());
//			System.out.println(msg);
			
		}
		
	}


