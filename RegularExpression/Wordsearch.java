package RegularExpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class Wordsearch {
//to search a specific word in the given sentence
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcbab ababababab";
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(s);
		int count=0;
		while(m.find())
		{
			count++;
			System.out.println("sentence has"+" "+m.group()+ "starts" +" "+ m.start());
		}
		System.out.println(count);
	}

}
