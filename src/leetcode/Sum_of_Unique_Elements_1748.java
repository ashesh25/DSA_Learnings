package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class Sum_of_Unique_Elements_1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,2};
		System.out.println(sum(a));
	}
	
	
	public static int sumOfUnique(int[] nums) {
		int sum = 0;
		int count =0;
		for(int i =0;i<nums.length;i++) {
			count = 0;
			for(int j = 0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count ++;
				}
			}
			if(count==1) {
				sum = sum + nums[i];
			}
			
		}
		
		return sum;
	}
	
	public static int sum(int[] nums) {
		HashSet<Integer> h = new HashSet<>();
		  int sum =0 ;
		  ArrayList<Integer> al  =new ArrayList<>();
		  
		  for(int i =0 ;i< nums.length ;i++){
		   if(!h.add(nums[i])){
		     al.add(nums[i]);
		     h.remove(nums[i]);
		   }
		    else{
		      h.add(nums[i]);
		    }
		  }
		  
		  for(int element:h){
		    if(!al.contains(element)){
		      sum+=element;
		    }
		  }
		  
		  return sum;
		
	}
	
	
}
