package MATRIX;

import java.util.Scanner;

public class MatrixAddition {

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
		
		int res[][] = new int [rm1][rm2];
		int mat1[][] = new int [rm1][cm1];
		int mat2[][]= new int [rm2][cm2];
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
		for(int i =0 ;i<rm1 ; i++)
		{
			for(int j=0;j<cm1;j++)
			{
				res[i][j] = mat1[i][j]+mat2[i][j];
			}
		}
			for(int i1 =0 ;i1<rm1 ; i1++)
			{
				for(int j=0;j<cm1;j++)
				{
					System.out.print(res[i1][j]+" \t");
				}
				System.out.println();
		}
	}

	}
