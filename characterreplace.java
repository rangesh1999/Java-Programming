package Accenture;

public class characterreplace {

	public static void main(String[] args) {
	
		String a ="rann";
		char c1 = 'a';
		char c2 ='n';
		char [] res = a.toCharArray();
		
		for(int i =0 ; i<res.length;i++)
		{
			if(res[i]==c1)
				res[i]=c2;
			else if(res[i]==c2)
				res[i]=c1;
			
			
		}
		String ass = String.valueOf(res);
		System.out.println(ass);
	}}