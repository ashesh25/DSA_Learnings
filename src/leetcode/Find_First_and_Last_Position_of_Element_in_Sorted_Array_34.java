package leetcode;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3};
		int target = 1;
		System.out.println(searchRange(nums, target));
	}
	
	public static int[] searchRange(int[] nums, int target) {
		int left = 0 ;
		int right = nums.length-1;
		int arr[] =new int[2];
		while(left<=right) {
			int mid = left + (right-left)/2;
			
			if( nums[mid] == target ) {
				if(mid !=0 && nums[mid] == nums[mid-1] && nums.length>1) {
					arr[1] = mid;
					arr[0] = mid-1;
					return arr;
				}
				else if(nums.length>1 && mid!=nums.length-1&& nums[mid] == nums[mid+1]){
					arr[0] = mid;
					arr[1] = mid + 1;
					return arr;
				}
				else {
					arr[0] = 0;
					arr[1] = mid;
					return arr;
				}
					
				
			}
			else if(nums[mid] < target) {
				left = mid + 1;
			}
			else
				right = mid - 1;
		}
		arr[0]  = -1;
		arr[1] = -1;
		return arr;
    }
	

}
