package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer>as  = new ArrayList<Integer>();
			int frequency[]= new int [101];
			as.add(1);
			as.add(2);
			as.add(2);
			as.add(3);
			as.add(1);
			as.add(2);
			//int frequency[] = new int[101];
			int result = Integer.MIN_VALUE;

			for (int i = 0; i < as.size(); i++) {
				int index=as.get(i);
				frequency[index]++; //frequency[index]=frequency[index]+1
			}

			for (int i = 1; i <= 100; i++) {
				result = Math.max(result, frequency[i] + frequency[i - 1]);
				System.out.println(result);
			}
			

			System.out.println(result);
			System.out.println(Integer.MIN_VALUE);
	}
	

}
