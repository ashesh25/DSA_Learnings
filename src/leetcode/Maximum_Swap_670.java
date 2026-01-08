package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Swap_670 {
	
	public static void main(String[] args) {
		System.out.println(maximumSwap(9973));
	}
	
	public static int maximumSwap(int num) {
		int num1 = num;
		int result = 0;
		int max = 0;
		List<Integer> li =  new ArrayList<Integer>();
		while(num > 0) {
			int remainder = num % 10;
			li.add(remainder);
			if(max<remainder) {
				max = remainder;
			}
			num = num/10;
		}
		if(li.size() == 1 ) {
			return num1;
		}
		else {
		int replaceItem = li.get(li.size() -1);
		li.remove(li.size() -1);
		li.add(li.size() -1,max);
		for( int i = 0; i < li.size(); i++) {
			if( li.get(i) == max ) {
				li.remove(i);
				li.add(i, replaceItem);
				break;
			}
		}
		int j = 1;
		for( int i = 0 ; i < li.size(); i++) {
			
			result = result + (li.get(i)*j);
			j = j * 10;
		}
		}
		return result;
    }
}
