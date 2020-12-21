package Accenture;

import java.util.Scanner;

public class PalindromeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int z = s.nextInt();
		int x = s.nextInt();
		for(int i =z; i<x;i++)
		{
			StringBuilder ss = new StringBuilder(String.valueOf(i));
			ss.reverse();
			int palin = Integer.parseInt(ss.toString());
			if(palin==i)
				System.out.print(i+" "+ "");
				
			
			
			
			
			
			
			
			
			
		}
	}

}
