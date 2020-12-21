package MATRIX;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("unused")
		int mat1[][] = {{1,2,3},{4,5,6},{6,7,8}};
		
		System.out.println(" Before Transposing");
		System.out.println("------------------------");
		int transpose[][]= new int[3][3];
		for(int i =0 ; i<3 ;i++) {
			for (int j=0 ;j<3; j++) {
				System.out.print(mat1[i][j] + " ");
				
				
	}
			System.out.println();
		}
		
		System.out.println("After Transpose");
		System.out.println("------------------");
		
		for(int i =0 ;i<3; i++) 
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j]= mat1[j][i];
			}
		}
	
		System.out.println(" After Transposing");
		System.out.println("------------------------");
		
		for(int i =0 ; i<3 ;i++) {
			for (int j=0 ;j<3; j++) {
				System.out.print(transpose[i][j] + " " );
				
				
	}
			System.out.println();
		}
	}
	

}
