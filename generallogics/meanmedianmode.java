package generallogics;

import java.util.Arrays;
import java.util.Scanner;

public class meanmedianmode {
	

		public static  double mean(int arr[])
		{
			int len = arr.length;
			Arrays.sort(arr);
			int sum = 0;
			for(int i = 0 ; i< len ; i++)
				sum += arr[i];
			
			return  sum/len;
		}
		
		
		
		public static void main(String[] args) {
				Scanner s  = new Scanner(System.in);
				
	 int meanarr[] = new int [10];
	 for ( int i =0 ; i< 10 ; i++)
		 meanarr[i]= s.nextInt();
	 
	  int  N = meanarr.length;
	  
	meanmedianmode a = new  meanmedianmode();
		}

	}


