package hackerrank;

 class Stack
{
	static final int max=1000;
	int top;
	int arr []= new int [max];
	
	
	boolean isempty()
	{
		return top<0;
	}
	Stack()
	{
		top = -1;
	}
	boolean push (int x)
	{
		if(top>=max-1) {
			System.out.println("stack overflow");
			return false;
		}
		else
			{
				arr[++top]= x;
		System.out.println(x+ "pushed");
			return true;
			}
	}
	int pop()
	{
		if(top<0)
		{
				System.out.println("Stack underfllw");
				return 0;
		}
		else
		{
			int x = arr[top--];
			return x;
			
		}
		}
		int peek()
		{

			if(top<0)
			{
					System.out.println("Stack underfllw");
					return 0;
			}
			else
			{
				int x = arr[top];
				return x;
				
				
			}
			
			
		}
	}
	
	


public class stackusingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack s = new Stack();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        System.out.println(s.pop() + " Popped from stack");
	}

}
