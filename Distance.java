package Accenture;

import java.text.DecimalFormat;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 = 1;
		double y1 = 1;
		double x2 =2 ;
		double y2=4;
		double x3 = 3;
		double y3 =6;
		double res = Math.sqrt(Math.pow(x2-x1, 2)  +Math.pow(y2-y1, 2));
		double res2 =  Math.sqrt(Math.pow(x3-x2, 2) +Math.pow(y3-y2, 2));
		double res3 =  Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
		
		
		System.out.printf(String.format("%.2f", res));
		System.out.println();
		System.out.printf(String.format("%.2f", res2));
		System.out.println();
		System.out.printf(String.format("%.2f", res3));
	}

}
