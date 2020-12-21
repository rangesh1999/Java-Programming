package hackerrank;

public class newfibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		double sum = 1;
		for(int i =1; i <=n;i++)
		{
			System.out.println(sum);
			sum = (Math.pow((1+Math.sqrt(5)), i) - Math.pow((1-Math.sqrt(5)), i))/Math.pow(2, i)*Math.sqrt(5);
			
		}
	}

}
