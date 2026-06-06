package search;

public class Day_7_Binary_Search_Insertion_06_06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,3,5,6};
		int target = 7;
		System.out.println(searchIndex(nums,target));
		
	}
	
	public static int searchIndex(int[] nums,int target) {
		int left = 0;
	    int right = nums.length - 1;

	    while(left <= right) {

	        int mid = left + (right-left)/2;

	        if(nums[mid] == target) {
	            return mid;
	        }

	        if(nums[mid] < target) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }

	    return left;
	}
	
	

}
