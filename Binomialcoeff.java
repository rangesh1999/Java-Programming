package Accenture;

public class Binomialcoeff {

	static int binomial(int n , int k)
	{
		if(k>n)
			return 0;
		if(k==0 || k==n)
			return 1;
		
		return(binomial(n-1 , k-1)+ binomial(n-1,k));
	}
	
	
	public static void main(String[] args) {
		//1. recursive function
int res = binomial(5,2);
System.out.println(res);
	}

}
