package RegularExpression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobilenovalidation {
	
	
	


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 File myfile = new File("C:\\Users\\range\\Desktop\\mobileno.txt");
		Scanner scan = new Scanner (myfile);
		boolean hasline = scan.hasNext();
		while(hasline)
		{
			String word = scan.next();
			
			int i = word.lastIndexOf('-');
			String username = word.substring(0, i);
			String mobile = word.substring(i+1);
			Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
			
			Matcher m = p.matcher(mobile);
			System.out.println("username"+": "+username);
			if(m.find())
			System.out.println(m.group()+"is a valid number");
			else 
				System.out.println(mobile+"is not a valid number");
			
			hasline = scan.hasNext();
		
		}
		
		
	}
	

}
