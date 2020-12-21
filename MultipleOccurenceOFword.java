package Accenture;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class MultipleOccurenceOFword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="cat batman latt cat matter cat matter";
		
		String[] arr = text.split(" ");

		int count ;
		for(int i =0 ; i<arr.length;i++)
		{
			count =1;
			for(int j = i+1 ; j<arr.length;j++)
			{
				if(arr[i].equals(arr[j])) {
					count++;
				arr[j] = "0";
				
				}
			}
			
		
	if(count>1 && arr[i]!="0")
		System.out.print(arr[i]+" ");
		}
	}

}
