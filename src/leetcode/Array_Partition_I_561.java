package leetcode;

import java.util.Arrays;

public class Array_Partition_I_561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {6,2,6,5,1,2};
		System.out.println(arrayPairSum(a));
	}
	
	public static int arrayPairSum(int[] nums) {
        int sum =0;
		Arrays.sort(nums);
		for(int i = 0 ;i<nums.length;i++) {
			if(i%2==0) {
				sum = sum + nums[i];
			}
		}
		
		
		return sum;
    }

}
