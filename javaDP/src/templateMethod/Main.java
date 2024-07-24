package templateMethod;

public class Main {

		public static void main(String[] ar) {
			
			AbstractDisplay d1 = new CharDisplay('H');
			d1.display();
		
			
			AbstractDisplay d2 = new StringDisplay("아르펠!");
			d2.display();
			
			AbstractDisplay d3 = new StringDisplay("ABCD");
			d3.display();
		}
}
