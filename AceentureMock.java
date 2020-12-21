package Accenture;

public class AceentureMock {

	public static void main(String args[])
	{
		
		int n = 95;
        int sum =0;
        int x = n;
        while(n!=0)
        {sum += n%10;
        n =n/10;
        }
        
    
        if(n%sum==0)
        {
        	System.out.println(x/sum);
        }
        else
        System.out.println("0");
	}
}
