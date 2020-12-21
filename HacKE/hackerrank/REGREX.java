package hackerrank;

public class REGREX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t1 = 0 ;  int t2 =1;
		int sum =0;
		int search = 5555654;
		boolean s = false;
		for(int i =1 ; i<100000; i++)
		{
			if(t1==search)
			{
				s= true;
			break;
			}			sum = t1+t2;
			t1 = t2;
			t2= sum;	
			
		}
		if(s)
		System.out.println("yes its a fibonacci");
		else
			System.out.println("not a fibonacci");
	}
	

}
