package Accenture;

public class generalPalindrome {

	public static void main (String args[])
	{
		
		
		for(int i =100 ; i<=200 ; i++)
		{
		int temp = i;
		int rev = 0;
		while(temp!=0)
		{
			int tmp = temp;
			int rem = tmp%10;
			rev = rev*10+rem;
			temp/=10;
		}
		
		if(rev == i)
			System.out.println(i);
	
	}}
}
