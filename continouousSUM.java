package Accenture;

public class continouousSUM {
 
	static int consum (int x[] , int n)
	{
		int curmax =x[0]; 
				int maxever =x[0];
		for(int i =1 ; i<n;i++)
		{
			curmax = Math.max(x[i], curmax+x[i]);
			maxever = Math.max(maxever, curmax);
			
		}
		return maxever;
		
		
	}
	public static void main(String[] args) {
		
		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int n = a.length;
		int maxsum = consum(a,n);
		System.out.println(maxsum);
		
		
	}

}
