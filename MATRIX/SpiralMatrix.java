package MATRIX;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int N = 3 ;
int M = 3;
int top = 0;
int b = M-1;
int right = N-1;
int left = 0;
int dir =0;
int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
List<Integer> res = new ArrayList<>(); 
while(top<=b && left<=right )
{
	if(dir ==0)
	{
		for(int i = top ; i<right ; i++)
			 res.add(mat[top][i]);
				
			top++;
	}
	else if (dir==1)
	{
		for (int i = top ; i<=b; i++ )
			res.add(mat[i][right]);
		right--;
	}
	else if (dir ==2)
	{
		for(int i =right ; i>=left ; i--)
		{
			res.add(mat[b][i]);
			
		}
		b--;
	}
	else if (dir ==3)
	{
		for(int i = b ; b>=top ; b--)
			res.add(mat[i][left]);
		left++;
	}
	dir = (dir+1)%4;
}
for(int each : res)
	System.out.print(each+" ");
	}

}
