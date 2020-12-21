package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.lang.*;
public class main
{
	public static void main(String[] args) {
		String plain = "hi this first online console program zzz ";
		for(char i ='a' ; i<='z';i++)
		{
		    int count=0;
		    String temp ="["+i+"]";
		
		Pattern p = Pattern.compile(temp);
		Matcher m = p.matcher(plain);
		while(m.find())
		{
		    count++;
		    
		}
		System.out.print(temp+"-"+count+" ");
	}}
}