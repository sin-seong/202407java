package java0730;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


public class StreamCos {
	public static void main(String[] ar) {

	String URL = "jdbc:mysql://localhost:3307/spring5fs";
	List<Score> list = new ArrayList<>();
	try(Connection conn = DriverManager.getConnection(URL,"root","mysql"); 
		Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from score")){
		while (rs.next()) {
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int math = rs.getInt("math");
			list.add(new Score(num, name, kor, eng, math));
		}
	}catch (SQLException e) {
		e.printStackTrace();// TODO: handle exception
	} 
		
		list.stream().forEach(System.out::println);
		int korSum = list.stream().mapToInt(s->s.getKor()).sum();
		int engSum = list.stream().mapToInt(s->s.getEng()).sum();
		int mathSum = list.stream().mapToInt(s->s.getMath()).sum();
		
		System.out.println("국어합계:"+korSum);
		System.out.println("영어합계:"+engSum);
		System.out.println("수학합계:"+mathSum);
		
		OptionalDouble korAvg = list.stream().mapToInt(s->s.getKor()).average();
		korAvg.ifPresent(avg-> System.out.println("국어평균:"+avg));
		
		OptionalDouble engAvg = list.stream().mapToInt(s->s.getEng()).average();
		engAvg.ifPresent(avg-> System.out.println("영어평균:"+avg));
		
		OptionalDouble mathAvg = list.stream().mapToInt(s->s.getMath()).average();
		mathAvg.ifPresent(avg-> System.out.println("수학평균:"+avg));
		
		int totSum = list.stream().mapToInt(s->s.getSum()).sum();
		System.out.println("총점"+totSum);
		
		OptionalDouble totAvg = list.stream().mapToDouble(s->s.getAvg()).average();
		totAvg.ifPresent(avg -> System.out.println("전체평균:"+ avg));
}
}