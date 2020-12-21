package Accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLArgeNum {
	
	public static void main(String args[])
	{
		int arr[] = {1,8,0,2,3,5,6};
		if(arr.length<=3)
			System.out.println("0");
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		Arrays.sort(arr);
		for(int i =0 ;i<arr.length;i++)
		{
			if(i%2==0)
				even.add(arr[i]);
			else
				odd.add(arr[i]);
		}
		
		Collections.sort(even);
		Collections.sort(odd);
		System.out.println(even.get(even.size()-2)+odd.get(odd.size()-2));
	}
}
