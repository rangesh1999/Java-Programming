package hackerrank;

import java.util.Scanner;

public class primeOptimal {
	
	static boolean isPrime(int num)
	{
		if(num<=1)
			return false;
		else if( num ==2)
			return true;
		else if (num%2==0)
			return false;
		
		//int flag =0;
		for(int i =3 ; i<=Math.sqrt(num) ; i=1+2)
			{if(num%i==0)
				return false;
		
		
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner s = new Scanner(System.in);
			int T = s.nextInt();
			//long Start =  System.currentTimeMillis();
			for(int i =0; i<T ;i++)
			{
				int x = s.nextInt();
				if(isPrime(x))
					System.out.println("Prime");
				else
					System.out.println("Not Prime");
			}
		
	}

}
