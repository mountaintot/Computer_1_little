package array;

public class TransposeMatrix_867 {
	
	public  int[][] transpose(int[][] A){
		
		
		//��Ӧ�ý�A��ֵ��b������b��������������ȫ��A��ͬ��2*3���󽫳��ִ���
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
