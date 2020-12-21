package hackerrank;

public class vowelsbs {
	static boolean isvowel(char x)
	{
		return (x=='a'|| x=='e' || x=='i'||x=='o' || x=='u');
		
	}
	
	static String findsub(String s , int k)
	{
		
		int n = s.length();
		int vow =0;
		for (int i=0;i<k;i++)
		{
			if(isvowel(s.charAt(i)))
				vow++;
		}
		int maxvc = vow;
		String tempstr = s.substring(0,k);
	int	temp = vow;
	for(int i=1 ;i<n-k+1;i++)
	{
		if(isvowel(s.charAt(i-1)))
			temp -=1;
		if(isvowel(s.charAt(i+k-1)))
			temp+=1;
		if(maxvc <temp)
		{
			maxvc=temp;
			tempstr= s.substring(i,i+k);
			
		}
		if(maxvc==0)
			return "Not Found!";
		//return tempstr;
	}
	return tempstr;
	}
	
	
	    public static void main(String[] args) { 
	        String str = "rangesh"; 
	       // int k =5;
	        System.out.println(findsub(str,3));
	      
	} }