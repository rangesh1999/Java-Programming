package Accenture;
import java.util.*;
public class Nbase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 21;
		int Num =	5678;
	ArrayList <Integer> rem = new ArrayList<>();
	int quotient =0;
	quotient = Num/12;
	rem.add(quotient%n);
	while(quotient!=0)
	{
		rem.add(quotient%n);
		quotient /=n;
		
	}
	
	String res=" ";
	for(int i :rem)
	{
		if(i>9)
		{
			int a = i-9;
			a= 64+a;
			res +=(char)a;
		}
		else
			res +=String.valueOf(i);
	}
	System.out.println(res);
		
}
}