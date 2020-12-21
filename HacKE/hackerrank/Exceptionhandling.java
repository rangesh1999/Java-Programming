package hackerrank;
import java.util.*;

public class Exceptionhandling {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int  x ,y ;
		
		try {
			x= s.nextInt();
			y = s.nextInt();
			
			System.out.println(x/y);
			
				
				
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
