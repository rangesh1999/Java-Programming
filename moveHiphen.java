package Accenture;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class moveHiphen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x ="hi----pattu";
		if(x.length()==0)
			System.out.println("null");
		String res = new String();
		Pattern p = Pattern.compile("[-]{1,}");
		Matcher m = p.matcher(x);
		while(m.find())
			res +=m.group();
		Pattern p1 = Pattern.compile("[a-zA-Z]{1,}");
		Matcher m1 = p1.matcher(x);
		while(m1.find())
			res +=m1.group();
		System.out.println(res);
		
	}

}
