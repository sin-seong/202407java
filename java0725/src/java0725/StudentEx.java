package java0725;

import java.util.Arrays;
import java.util.Comparator;

public class StudentEx {

		public static void main(String[] ar) {
			Student[] students = {
					new Student("홍길동", 97),
					new Student("홍군동", 67),
					new Student("김길동", 77),
					new Student("고길동", 92),
					new Student("이길동", 68),
					new Student("아길동", 87)
					
			};
			Comparator<Student> c = new Comparator<Student>() {
				
				@Override
				public int compare(Student o1, Student o2) {
					return Integer.compare(o2.getScore(), o1.getScore());
				}
			};
			
			Arrays.sort(students, c);
			for(Student st : students) {
				System.out.println(st);
			}
		}
}
