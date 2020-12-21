package Accenture;

public class Fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =0;
		int b =1;
		int c = 0;
		
		for(int i =1 ; i<=10 ;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
