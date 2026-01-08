package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {
	
	public static void main(String[] args) {
		int a[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(a));
	}
	
	public static int majorityElement(int[] nums) {
		int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for( int i = 0; i < nums.length; i++) {
        	if( map.containsKey(nums[i]) ) {
        		map.put(nums[i], map.get(nums[i])+1);
        	}
        	else {
        		map.put(nums[i], 1);
        	}
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()) {
        	if( m.getValue() > nums.length/2 ) {
        		result = m.getKey();
        	}
        }
        return result;
    }
}
