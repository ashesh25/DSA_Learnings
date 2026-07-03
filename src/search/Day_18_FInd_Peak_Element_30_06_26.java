package search;

import java.util.Arrays;

public class Day_18_FInd_Peak_Element_30_06_26 {
    public static void main(String[] args) {
       int nums[] = {9,7,3,7,8};
       System.out.println(findPeakElement(nums)); 
    }

    public static int findPeakElement(int[] nums) {
        int result = 0;
        if(nums.length<3){
            if(nums.length==2){
                result = nums[1]>nums[0]?1:0;
            }
            else if(nums.length==1){
                result = 0;
            }
            return result;
        }
        for(int i = 1; i < nums.length - 1; i++){
            if((nums[i] > nums[i-1]) && nums[i] > nums[i+1])
                result = i;
        }
        if(result == 0){
            int last = nums[nums.length-1];
            Arrays.sort(nums);
            int sortedLast = nums[nums.length-1];
            if(last == sortedLast){
                result = nums.length-1;
            }
        }
        return result;
    }
}
