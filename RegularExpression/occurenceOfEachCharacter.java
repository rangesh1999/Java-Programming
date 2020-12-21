package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class occurenceOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s =" This is to check the occurence character in the given String alphabets z";
		for(char character = 'a'; character<='z';character++  )
		{
			int count=0;
			String temp ="["+character+"]";
		Pattern p = Pattern.compile(temp);
		Matcher m = p.matcher(s);
			while(m.find())
			{
				count++;
			}
			System.out.print(character + ":" +count+" ");
		}
	}

}
