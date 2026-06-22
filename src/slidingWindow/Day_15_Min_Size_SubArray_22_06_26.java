package slidingWindow;

public class Day_15_Min_Size_SubArray_22_06_26 {
    public static void main(String[] args) {
        int nums[] = {5,9,3,2,4,17,52,69,21,1};
        int target = 45;
        System.out.println(minSizeSubArray(nums, target));
    }

    public static int minSizeSubArray(int nums[], int target){
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            sum = sum + nums[right];
            while(sum>=target){
                sum = sum - nums[left];
                minLength = Math.min(minLength, right - left + 1);
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
