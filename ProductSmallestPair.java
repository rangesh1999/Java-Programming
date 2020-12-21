package Accenture;

import java.util.Arrays;

public class ProductSmallestPair {
	
	
	
	public static int Productpair(int arr[], int sum)
	{
		Arrays.sort(arr);
		if(arr[0]+arr[1]<sum && arr.length<2)
		return -1;
		else
		{
			return arr[0]*arr[1];
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr []= {9,8,3,-7,3,9};
int sum = 9;
		System.out.println(Productpair(arr,sum));
	}

}
