package Accenture;

public class Stringpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "ABC";
int n =s.length();
Stringpermutation ss= new Stringpermutation();
ss.calculate(s, 0, n-1);
	}

	private void calculate(String str , int left , int right)
	{
		if(left == right )
			System.out.println(str);
		else
		{
			for(int i = left ; i<= right ;i++)
			{
				String swapped =swap(str , left, i);
			calculate (swapped , left+1,right);
			}
		}
	}
	
	
	private String swap(String str, int i,int j)
	{
		
		char temp;
		char [] chararray = str.toCharArray();
		temp = chararray[i];
		chararray[i] = chararray[j];
		chararray[j]= temp;
		
		return String.valueOf(chararray);
	}
	
	
	
}
