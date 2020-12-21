package hackerrank;

import java.util.LinkedList;

 class sta {
	int top;
	int arr [] = new int[10];
	sta()
	{
		top = -1;	}
	
	boolean isempty()
	{
		
			return top<0;
	}
		
	boolean push (int x)
	{
			if(top==9) {
				System.out.println("overflow");
				return false;}
			else
			{
				arr[++top]= x;
				System.out.println("pushed is:"+x);
				return true;
			}
	}
		int pop()
		{
			if(top<0)
			{
				System.out.println("underflow");
				return 0;
			}
			else
			{
				int x = arr[top--];
				System.out.println("popped is "+x);
				return x;
			}
		}
			int peek ()
			{
				
				if(top <0)
				{
					System.out.println("cannout be empty");
					return 0 ;
				}
				else
				{
					int x = arr[top];
					System.out.println(x);
					return x;
				}
			
		
	}	
			
		public void printarray()
		{
			for(int a :arr)
				System.out.println(a);
			
		}
}

public class stackcolection
{
	
public static void main(String args[])
{
	sta ss =new sta();
	ss.push(10);
	ss.push(15);
	ss.push(45);
	ss.push(5);
	ss.printarray();
		
	ss.pop();
	ss.peek();
}
}	
	

