package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Day_2_Frequency_Counting_01_06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {1,1,2,2,2,3,3};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			if ( map.containsKey(nums[i]) ) {
				map.put(nums[i], map.get(nums[i])+1);
			}
			else {
				map.put(nums[i], 1);
			}
		}
		
		map.forEach((k, v) -> System.out.println(k + "->" + " " + v));

	}

}
