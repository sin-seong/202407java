package java0712;



public class Ex031 {
		public static void main(String[] args) {
			int[][] scores = new int [2][3];
			
			int[][]arr = {
						{95,86},
						{83,92,96},
						{78,83,93,87,88}
			};
			int sum = 0;
			double avg = 0.0;
			int cnt = 0;
			
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr.length; j++) {
					sum +=arr[i][j];
					cnt++;
				}
				
			}
			avg = (double)sum /cnt;
			System.out.println("sum="+ sum);
			System.out.println("avg="+ avg);
			
			

		}
}
			
			
		

