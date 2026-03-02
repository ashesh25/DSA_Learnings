package dsa.array;

import java.util.HashMap;

public class Array_1_Two_Sum_Easy {
	
	
	/*
	 * Example input = [2,7,11,15] Target 9
	 * output = [0,1]
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2,7,11,15};
		int target = 9;
		int arr[] = twoSum(input, target);
		int arr_1[] = twoSumHashMap(input, target);
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		for(int i = 0; i < arr_1.length; i++ ) {
			System.out.print(arr_1[i]+ " ");
		}

	}
	
	public static int[] twoSum(int[] input, int target) {
		int arr[] = new int[2];
		
		for(int i = 0; i < input.length - 1; i++ ) {
			for( int  j = i+1; j < input.length; j++ ) {
				if( input[i] + input[j] == target ) {
					arr[0] = i;
					arr[1] = j;
					break;
				}
			}
		}
		
		return arr;
	}
	
	public static int[] twoSumHashMap(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    
	    for(int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        
	        if(map.containsKey(complement)) {
	            return new int[]{map.get(complement), i};
	        }
	        
	        map.put(nums[i], i);
	    }
	    
	    return new int[]{};
	} 

}
