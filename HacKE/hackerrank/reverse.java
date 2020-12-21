package hackerrank;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int res=0;
		while(n!=0)
		{
			
			int nn = n%10;
			res = res*10+nn;
			n /=10;
			
			
		}
System.out.println(res);
}}