package MATRIX;

import java.util.Scanner;

public class ONED {
///matrix multiplication
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("enter row of mat1");
		
		int rm1 = s.nextInt();
		System.out.println("enter row of mat2");
		int rm2 = s.nextInt();
		System.out.println("enter column of mat1");
		int cm1 = s.nextInt();
		System.out.println("enter column of mat2");
		int cm2 = s.nextInt();
		int sum =0;
		if(cm1!=rm2)
			System.out.println("cannot be multiplied");
		else
		{
			int mat1[][] = new int [rm1][cm1];
			int mat2[][]= new int [rm2][cm2];
			int res[][] = new int [rm1][cm2];
			for(int i =0 ; i<rm1;i++)
			{
				for(int j =0 ; j<cm1 ; j++)
				{
					mat1[i][j] = s.nextInt();
				}
			}
			for(int i =0 ; i<rm2;i++)
			{
				for(int j =0 ; j<cm2 ; j++)
				{
					mat2[i][j] = s.nextInt();
				}
			}
			for(int i =0 ; i<rm1;i++)
			{
				for(int j=0 ;j<cm2;j++)
				{
					for(int k =0 ;k<cm1;k++)  //for sum the iteration
					{
						sum += mat1[i][k]*mat2[k][j];
					}
					res[i][j] = sum;
					sum =0;
					
				}
			}
			
			System.out.println("Printing matrix");
			System.out.println("----------------");
			for(int i =0 ; i<rm1;i++)
			{
				for(int j =0; j<cm2;j++)
				{
					
					System.out.print(res[i][j]+  " \t");
				}
				System.out.println();
			}
			
			
			
			
		}
		
	}

}
