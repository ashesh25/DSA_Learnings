package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class The_Two_Sneaky_Numbers_of_Digitville_3289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,3,2,1,3,2};
		
		int result[] = getSneakyNumbers(arr);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public  static int[] getSneakyNumbers(int[] nums) {
        List<Integer> a = new ArrayList<Integer>();
        
        for( int  i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++) {
                if ( nums[i] == nums[j] ) {
                    a.add(nums[i]);
                    break;
                }
            }
            if ( a.size() == 2 ) {
                break;
            }
        }

        int result[] = new int[2];
        
        for(int i = 0 ;i<a.size();i++) {
        	result[i] = a.get(i);
        }
        return  result;
    }

}
