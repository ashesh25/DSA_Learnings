package search;

public class Day_6_Binary_Search_05_06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1,0,3,5,9,12};
		int target = 2;
		System.out.println(search(nums, target));
	}
	
	public static int search(int[] nums, int target) {
        int l = nums.length;
		int left = 0;
        int right = l - 1;
        
        
        while( left <= right ) {
        	int mid = left + (right-left)/2;
        	
        	if( target == nums[mid]) {
        		return mid;
        	}
        	else if (target < nums[mid]) {
        		right = mid -1;
        	}
        	else {
        		left = mid + 1;
        	}
        }
        return -1;
	}
}

/*
 * Easy:
 * 
 * 704. Binary Search Search Insert Position
 * 
 * Medium:
 * 
 * 34. Find First and Last Position Search in Rotated Sorted Array
 * 
 * Very Common Interview Problem:
 * 
 * 153. Find Minimum in Rotated Sorted Array
 */
