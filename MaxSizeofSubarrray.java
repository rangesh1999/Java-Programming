package Accenture;

public class MaxSizeofSubarrray {

	public static void main(String[] args) {
		//Using sliding window algorithm
		// Time - complexity - O(n).
		
		int windowsum =0;
		int maxsum=0;
		int [] arr = {1,9,-1,-2,7,3,-1,2};  //given array.
		int k =4 ; //length of sub array;
		
		//1.one loop to traverse whole array.
		for(int i =0 ;i <k;i++)
		{
			windowsum = windowsum+arr[i];
			
		}
		for(int end = k; end<arr.length;end++)
		{
			windowsum += arr[end] - arr[end-k];
			maxsum = Math.max(maxsum, windowsum);
		}
		System.out.println(maxsum);
	}

}
