package Accenture;

import java.util.ArrayList;
import java.util.Collections;

public class SubMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,4,1,7,9};
		
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();
		
		for(int i =0 ;i<a.length;i++)
		{
			if(i%2==0)
				even.add(a[i]);
			else
				odd.add(a[i]);
			
			
		}
		Collections.sort(even);
		Collections.sort(odd);
		
		for(int i : even)
			System.out.print(i+" ");
		System.out.println();
		for(int i : odd)
			System.out.print(i+" ");
		int evenL=0,oddL=0;
		for(int i : even)
			if(i>evenL)
				evenL = i;
		for(int i : odd)
				if(i>oddL)
					oddL = i;
		//second largest
		int evenSL =0,oddSL=0;
		for(int i=0;i<even.size();i++)
		{
			if((even.get(i)>evenSL) && even.get(i)<evenL)
				evenSL = even.get(i);
		}
		for(int i=0;i<odd.size();i++)
		{
			if((odd.get(i)>oddSL) && odd.get(i)<oddL)
				oddSL = odd.get(i);
		}
		System.out.println(evenSL);
		System.out.println(oddSL);
	}

}
