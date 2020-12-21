package Accenture;

public class AddingCarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =451;
		int b =349;
		int count=0;
		int temp1 =a;
		int temp2=b;
		int carry=0;
		while(temp1!=0&&temp2!=0)
		{
			
			
			temp1 = a%10;
			temp2 =b%10;
			int sum =carry+ temp1+temp2;
			if(sum>9) 
			{
				count++;
				carry=1;
			}
			else
				carry =0;
			a= a/10;
			b = b/10;
		}
		System.out.println(count);
	}

}
