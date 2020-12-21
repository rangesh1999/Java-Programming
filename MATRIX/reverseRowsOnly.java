package MATRIX;

public class reverseRowsOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int last[][] = new int [3][3];
		for(int i =0; i<3;i++)
		{
			int start = 0;
			int end = 2;
			
			while(start<end)
			{
				int temp =mat[i][start]; 
				mat[i][start] = mat[i][end];
				mat[i][end]= temp;
				start++;
				end--;
				
			}
		}

		for(int i =0 ; i<3 ;i++) {
			for (int j=0 ;j<3; j++) {
				System.out.print(mat[i][j] + " " );
				
				
	}
			System.out.println();
		}
		
	}
}
