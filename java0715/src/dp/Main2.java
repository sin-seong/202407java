package dp;

public class Main2 {

	public static void main(String[] args) {
		Student minsu = new Student("민수");//학생등록
		Student sunggu = new Student("성구");
		Course java = new Course("cs100","자바");//코스등록
		Course cplus = new Course("cs100","C/C++");//코스 등록
		minsu.registerCourse(java);
		minsu.registerCourse(cplus);
		java.addStudent(minsu);
		cplus.addStudent(minsu);
		
		Student gildong = new Student("길동");//학생등록
		gildong.registerCourse(java);
	
//		System.out.println(minsu);
//		System.out.println(gildong);
//		
		//코스별 신청자 출력
		java.addStudent(sunggu);
		java.addStudent(gildong);
//		
//		System.out.println(java.getStudents());
//		System.out.println("자바 수강자:"+java.getName());
		
		
		System.out.println("자바 수강신청자:" + java.getNumOfStudents() +"명");
		for (Student student : java.getStudents()) {
			System.out.println(student.getName());
		}
		System.out.println("C/C++ 수강신청자:" + cplus.getNumOfStudents() +"명");
		for (Student student : cplus.getStudents()) {
			System.out.println(student.getName());
		}
		
	}
}
