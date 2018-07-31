package array;

import org.junit.Test;

public class ToeplitzMatrix_766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;
		for (int i = 1; i < r; i++) {
			for (int j = 1; j < c; j++) {
				if(matrix[i][j]!=matrix[i-1][j-1]) {
					return false;
				}
			}
		}
		return true;
	}

	@Test
	public void isToeplitzMatrix_Test() {
		int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if(matrix[i][j]!=matrix[i-1][j-1]) {
					System.out.println("false");
				}
			}
		}
		System.out.println("true");
	}
}
