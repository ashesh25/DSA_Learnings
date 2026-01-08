package leetcode;

public class Sum_of_All_Subset_XOR_Totals_1863 {
	
	public static void main(String[] args) {
		int nums[] = {5,1,6};
		System.out.println(subsetXORSum(nums));
	}
	
	public static int subsetXORSum(int[] nums) {
		int sum = 0;
        int n = nums.length;

        for (int mask = 0; mask < (1 << n); mask++) {
            int xorTotal = 0;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    xorTotal ^= nums[i];
                }
            }
            sum += xorTotal;
        }
        
        return sum;  
    }
}
