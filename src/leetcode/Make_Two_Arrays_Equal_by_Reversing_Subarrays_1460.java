package leetcode;

import java.util.Arrays;

public class Make_Two_Arrays_Equal_by_Reversing_Subarrays_1460 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4};
		int b[] = {2,4,1,3};
		System.out.println(canBeEqual(a,b));
	}
	
	public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        int count =0;
       for(int i =0 ;i<arr.length;i++) {
    	   if(arr[i] == target[i])
    		   count++;
       }
       if(count==arr.length)
    	   return true;
       else
    	   return false;
    }

}
