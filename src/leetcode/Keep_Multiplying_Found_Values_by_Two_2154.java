package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Keep_Multiplying_Found_Values_by_Two_2154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {8,9,4,2,15,3};
		System.out.println(findFinalValue(a,2));
	}
	
	public static int findFinalValue(int[] nums, int original) {
		/*int count  =0 ;
		boolean flag = false;
	    for(int i = 0;i<nums.length;i++) {
	    	if(nums[i]%original==0)
	    		count++;
	    	if(nums[i]==original) {
	    		original = 2* original;
	    		flag = true;
	    	}
	    		
	    	if(i==nums.length-1 && count>1 && flag == true) {
	    		i=-1;
	    		count =0;
	    	}
	    		
	    }*/
		  
	       boolean cond = true;
	        while(cond){
	            for(int i=0;i<nums.length;i++){
	            	cond = false;
	                if(nums[i]==original){
	                    original = original*2;
	                    cond = true;
	                    i = -1;
	                }
	            }
	        }
	        
	        return original;
	 }

}
