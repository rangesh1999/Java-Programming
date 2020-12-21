package hackerrank;

import java.util.HashSet;
import java.util.Set;

public class vovelsubstring {
	 
	static String findsub(String s , int k)
	{
	
		int vc =0 ;
		for(int i =0 ; i< k ; ++i) 
			if(isvowel(s.charAt(i))) vc++;
		if(k==vc)
		return s.substring(0,k);
		String c = new String();
		int l =0 ; int end = k-1;
		
		int maxvc  = vc;
		
		while(end<s.length()-1)
		{
			if(isvowel(s.charAt(l))) vc--;
			
			l++;
			end++;
			if(isvowel(s.charAt(end))) vc++;
			if(vc>maxvc)
				c = s.substring(l,end+1);
			//maxvc = Math.max(maxvc, vc);
			
				
		}
		return c;
		
	}
	
	static boolean isvowel(char x)
	{
		return (x=='a'|| x=='e' || x=='i'||x=='o' || x=='u');
		
	}
	
	    public static void main(String[] args) { 
	        String str = "rangesh"; 
	       // int k =5;
	        System.out.println(findsub(str,2));
	      
	} }