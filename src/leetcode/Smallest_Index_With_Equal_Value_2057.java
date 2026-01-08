package leetcode;

public class Smallest_Index_With_Equal_Value_2057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
		System.out.println(smallestEqual(a));
	}
	
	 public static int smallestEqual(int[] nums) {
		 int res = 0;
		 boolean flag = false;
	     for(int i = 0 ;i<nums.length;i++) {
	    	 if(i%10==nums[i]) {
	    		 res = i;
	    		 flag = true;
	    		 break;
	    	 }
	    	
	     }
		 if(flag == true)
			 return res;
		 else
			 return -1;
		 
	  }

}
