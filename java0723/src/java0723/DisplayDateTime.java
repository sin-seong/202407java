package java0723;

import java.time.LocalTime;

public class DisplayDateTime {

	public static void main(String[] args) {
	
		
		LocalTime localTime = LocalTime.now();
		System.out.printf("%d시%d분%d초\n",
				localTime.getHour(),localTime.getMinute(),localTime.getSecond());
	}

}
