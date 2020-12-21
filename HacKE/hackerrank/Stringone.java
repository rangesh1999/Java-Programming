package hackerrank;

import java.io.Serializable;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Stack;
import java.util.*;





public class Stringone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         HashMap <String, Integer> ph = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
           ph.put(name,phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
          if (ph.containsKey(s))
        	  System.out.println(ph.get(s)+"="+ph.keySet());
          else
        	  System.out.println("no entry found");
        }
	}
	}
	