package hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Day_9_Contains_Duplicate_09_06_26 {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }

    public boolean containsDuplicate_1(int[] nums) {

    HashSet<Integer> set =new HashSet<>();

    for(int num : nums) {

        if(set.contains(num)) {
            return true;
        }

        set.add(num);
    }

    return false;
}
}
