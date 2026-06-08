package slidingWindow;

public class Day_8_Variable_Sliding_Window_08_06_26 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        minSubArrayLen(target, nums);
    }

    public static int minSubArrayLen(int target, int[] nums) {
       int left = 0;
       int sum = 0;
       int minLength = Integer.MAX_VALUE;
       for(int right = 0; right<nums.length; right++){
            sum += nums[right];
            while(sum >= target) {
                sum -= nums[left];
                minLength = Math.min(minLength, right - left+1);
                left++;
            }
            
       }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

/*Related Problems
LC 209
LC 3
LC 76
LC 424*/
