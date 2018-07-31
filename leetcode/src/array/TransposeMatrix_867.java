package array;

public class TransposeMatrix_867 {
	
	public  int[][] transpose(int[][] A){
		
		
		//不应该将A赋值给b，这样b的行数列数将完全与A相同，2*3矩阵将出现错误
		//		int[][] b = A;
		
		
		
		int r = A.length;
		int c =A[0].length;
		
		int[][] b = new int[c][r];
		
//		int[length][length] b = A;
		int num = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				/*num = b[i][j];
				b[i][j] = b[j][i];
				b[j][i] = num;*/
				
				b[j][i] = A[i][j];
				
			}
			
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		return b;
	}
	

}
