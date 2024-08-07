package java0711;

public class Max {

	public static void main(String[] args) {
		int a[] = {1312,324,1320,23,822};
		int max= a[0];
		
		
		for(int i=1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		System.out.println("최대값은:" + max);

	}

}
