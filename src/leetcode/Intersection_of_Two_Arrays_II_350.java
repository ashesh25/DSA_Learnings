package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Intersection_of_Two_Arrays_II_350 {
	
	public static void main(String[] args) {
		int a[] = {4,9,5};
		int b[] = {9,4,9,8,4};
		intersect(a,b);
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        int i=0; int k=0; int j = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<l1 & j<l2) {
        	if(nums1[i]<nums2[j]) {
        		i++;
        	}
        	else if(nums1[i]>nums2[j]) {
        		j++;
        	}
        	else {
        		nums1[k++] = nums1[i++];
        		j++;
        	}
        }
        
        return Arrays.copyOfRange(nums1, 0, k);
        
    }
	
}
