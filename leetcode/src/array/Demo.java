package array;

public class Demo {
	public static void main(String[] args) {
		int[][] A = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		TransposeMatrix_867 t = new TransposeMatrix_867();
		t.transpose(A);
	}
}
