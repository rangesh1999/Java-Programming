package Accenture;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 12;
		int n = 50;
		
		int sum =0;
		
		for(int i=m ; i<=n;i++)
		{
			
			if(i%3==0 && i%5==0)
				sum+=i;
		}
		
		System.out.println(sum);
		
	}

}
