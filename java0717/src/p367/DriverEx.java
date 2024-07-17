package p367;

import java.util.Scanner;

public class DriverEx {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("차량을 선택 하시오(1.버스 , 2.택시");
		int num = sc.nextInt();
		
		Driver driver = new Driver();
		Vehicle v1 =null;
		switch (num) {
			case 1: v1 = new Bus();
			break;
			case 2: v1 = new Taxi();
			break;
			default:
				System.out.println("선택오류");
		}
 //			
//		driver.drive(vehicle);
		driver.drive(v1);
//		driver.drive(v2);
	}
}
