package java0729;

public class Ex3 {
	public static void main (String[] ar) {
		int x;
		Integer y;
		Integer z = 400;
		y=100;
		
		x= Integer.parseInt("400");
		y= new Integer("400");
		if(y.equals(z)) {
			System.out.println("같");
		}else {
			System.out.println("달");
		}
		
		
		String str2= String.valueOf(123);
		String str = "아이우에오";
		String newSter = str.replace("아이", "오이");
		str= str.replace("아이", "오이");
		System.out.println(str);
		System.out.println(newSter);
		if(str== newSter) {
			System.out.println("같저");
		}else {
			System.out.println("다저");
		}
		if(str.equals(newSter)) {
			System.out.println("같나?");
		}
	}
}
