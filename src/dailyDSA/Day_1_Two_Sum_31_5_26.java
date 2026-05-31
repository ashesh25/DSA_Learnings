package dailyDSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day_1_Two_Sum_31_5_26 {

	public static void main(String[] args) {
		// Nested Loop Approach
		int nums[] = {2,7,11,15};
		int target = 9;
		
		for( int i = 0; i < nums.length - 1; i++ ) {
			for( int j = i + 1; j < nums.length; j++ ) {
				if( nums[i] + nums[j] == target) {
					System.out.print(i +" "+ j);
					break;
				}
			}
		}
		
		//HashMap Approach
		
		Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                System.out.println(" "+ map.get(complement) + " " + i);
            }

            map.put(nums[i], i);
        }
        
        //Three Sum
        int nums_1[] = {2,7,11,15,5,9};
		int target_1 = 14;
		
		Map<Integer, Integer> map_1 = new HashMap<>();
		boolean flag = false;
        for(int i = 0; i < nums_1.length-2; i++) {


        	for(int j = i+1; j<nums_1.length;j++) {
        		int second = target_1 - nums_1[i] - nums_1[j];
        		if(map.containsKey(second)) {
        			flag = true;
                    System.out.println(" "+ map.get(second) + " " + i + " " + j);
                    break;
                }

                map.put(nums_1[j], j);
        	}
        	if (flag == true) {
        		break;
        	}
            
        }
        
       
        
	}

}
