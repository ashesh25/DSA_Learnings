package leetcode;

public class Minimum_Size_Subarray_Sum_209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 15;
		int nums[] = {1,2,3,4,5};
		System.out.println(minSubArrayLen(target, nums));
	}
	
	public static int minSubArrayLen(int target, int[] nums) {
		int k = 1;
		while(k<=nums.length) {
			int count = 0;
			int sum = 0;
			for(int i =0;i<k;i++) {
				sum = sum + nums[i];
			}
			if(sum == target) {
				return k;
			}
			for(int i = k; i < nums.length ; i++) {
				sum = sum - nums[i-k] + nums[i];
				if(sum == target) {
					return k;
				}
			}
			k++;
		}
		return 0;
		
    }

}
