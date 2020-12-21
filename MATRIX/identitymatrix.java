package MATRIX;

import java.util.Scanner;

public class identitymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner (System.in);

System.out.println("enter row of mat1");
		int r1 = s.nextInt();
		System.out.println("enter col of mat1");
			int c1 = s.nextInt();
			System.out.println("enter row of mat2");
				int r2 = s.nextInt();
				System.out.println("enter col of mat2");
					int c2 = s.nextInt();
		if(r1!=r2 || c1!=c2)
			System.out.println("NOT IDENTICAL");
		else
		{
		int mat1[][] = new int [r1][c1];
		int mat2[][] = new int [r2][c2];
		System.out.println("enter elements of mat1");
		for(int i =0 ; i<r1;i++)
		{
			for(int j = 0 ; j<c1 ; j++)
			{
				mat1[i][j] = s.nextInt();
			}
		}
		System.out.println("enter elements of mat2");
		for(int i =0 ; i<r1;i++)
		{
			for(int j = 0 ; j<c1 ; j++)
			{
				mat2[i][j] = s.nextInt();
			}
		}
		int count= 0 ;
		for(int i =0 ; i<r1;i++)
		{
			for(int j = 0 ; j<c1 ; j++)
			{
				if(mat1[i][j]!= mat2[i][j]) {
					System.out.println("Not identical");
					count++;
					break;
					}
				
				
			}
		}
		if(count==0)
			System.out.println("Identical");
		}
	}

}
