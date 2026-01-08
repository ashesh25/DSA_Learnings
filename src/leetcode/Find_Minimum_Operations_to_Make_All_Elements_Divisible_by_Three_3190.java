package leetcode;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three_3190 {
	public static void main(String[] args) {
		int a[] = {};
		System.out.println(minimumOperations(a))			;
	}
	
	public static int minimumOperations(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]%3!=0) {
				count++;
			}
		}
		return count;
        
    }
	
	
}
