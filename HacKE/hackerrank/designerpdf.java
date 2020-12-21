package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class designerpdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=20,  j=23, k=6;
		int count=0;
		int reversenum= 0;
		int tem=0;
		StringBuffer sb = new StringBuffer();
		List<Integer> as = new ArrayList<Integer>();
		List<Integer> sa = new ArrayList<Integer>();
		for(int s=i ;s<=j;s++ )
		{
			sa.add(s);
			int sum ;
			sb.append(String.valueOf(s));
			sb.reverse();
			as.add(Integer.parseInt(sb.toString()));
			
			
			sb.delete(0, sb.length());
			
		}
		
			for(int s = 0 ; s<as.size();s++)
			{
				int y=0;
				y=Math.abs(as.get(s)-sa.get(s));
				if(y%k==0)
					count++;
			}
			
		
	System.out.println(count);
	

}
}