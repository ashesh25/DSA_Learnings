package hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Day_14_Longest_Consecutive_Sequence_18_06_26 {

    public static void main(String[] args) {
        int nums[] = {1,0,1,2};
        System.out.println(longestConsecutive(nums));   
    }

    public static int longestConsecutive(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1]-1 == nums[i] || nums[i-1]+1 == nums[i]){
                count++;
            }
            else if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                count = 0;
            }
            maxLength = Math.max(maxLength, count);
        }
        if(nums.length==0)
            return 0;
        return maxLength+1;
    }

    public int longestConsecutive1(int[] nums) {       
        if(nums.length <= 1) return nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);        
        int res = 1;        
        for(int i : set){
            int temp = 1;
            if(!set.contains(i-1)){
                int j = i;
                while(set.contains(j+1)){                  
                    j = j + 1;
                    temp++;
                }
            }
            res = Math.max(res , temp);
        }
        return res;
        
    }
}
