package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class decendingPrime {
	
	public static boolean isprime(int d)
	{
		 int flag=0;
		if(d<=1)
		{
			return false;
			
		}
		else
		{
			for(int i =2; i<=Math.sqrt(d);i++)
			{
				if(d%i==0)
					return false;
				
			}
			return true;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer >res =new ArrayList<Integer>();
		
		for(int i = 0 ; i<100 ;i++)
				
		{	
			
			if(isprime(i))
			{	//System.out.print(i+" ");
				res.add(i);
			}
		}
		Collections.sort(res,Collections.reverseOrder());
		for(int k =0 ; k<res.size();k=k+2)
		{
			System.out.print(res.get(k)+" ");
		}
	}		
	}


