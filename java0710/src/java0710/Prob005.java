package java0710;

public class Prob005 {

	public static void main(String[] args) {
		for(int x =2; x<=9; x++) {
			System.out.printf("*** %d단 ***\n",x);
			for(int y =1; y<=9; y++ ) {
				System.out.printf(x+"x"+ y + "=" + (x*y)+ "\n" );
				//System.out.printf("%d x %d = %d\t",x,y,x*y);
				
			}
			
		}

	}

}
