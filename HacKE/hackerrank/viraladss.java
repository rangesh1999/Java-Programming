package hackerrank;

public class viraladss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 3;
int sum =5;
int share=5 ;
int result=0;
for(int i =0 ; i<n ;i++)
{
	//System.out.println(share) ;
	
	int half =2;
	int liked = Math.floorDiv(sum, half);
	result = result+liked;
	//System.out.println(liked);
	sum += (liked *3) -5;
	share = sum;
	System.out.println(sum
			);
	 
}

//System.out.println(result);
	}

}
