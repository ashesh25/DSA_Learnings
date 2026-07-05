package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sum_Of_Arrays_05_07_26 {

    public static void main(String[] args) {
        int nums[] = {5724,111,350};
        maxDigitRange(nums);
    }

    public static int maxDigitRange(int[] nums) {
        int max = 0;
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            ArrayList<Integer> arr = new ArrayList<Integer>();;
            
            int j = 0;
            while(a>0){
                arr.add(a%10);
                a = a/10;
                j++;
            }
            Collections.sort(arr);
            int sum = arr.get(arr.size()-1)-arr.get(0);
            if(sum>max){
                max=sum;
                arr1.clear();
                arr1.add(nums[i]);
            }
            else if(sum==max){
                arr1.add(nums[i]);
            }
            
        }
        int result = 0;
        for(int i = 0; i < arr1.size(); i++){
            result = result + arr1.get(i);
        }
        return result;
    }
}
