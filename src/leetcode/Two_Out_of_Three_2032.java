package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Two_Out_of_Three_2032 {
	public static void main(String[] args) {
		int a[] = {1,2,2};
		int b[] = {4,3,3};
		int c[] = {5};
		
		//System.out.println(twoOutOfThree(a,b,c));
		System.out.println(better1(a,b,c));
	}
	
	public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
	     List<Integer> li = new ArrayList<Integer>();   
	     Set<Integer> s = new TreeSet<Integer>();
		for(int i =0;i<nums1.length;i++) {
			for(int j =0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					s.add(nums1[i]);
				}
			}
		}
		for(int i =0;i<nums1.length;i++) {
			for(int j =0;j<nums3.length;j++) {
				if(nums1[i]==nums3[j]) {
					s.add(nums1[i]);
				}
			}
		}
		for(int i =0;i<nums2.length;i++) {
			for(int j =0;j<nums3.length;j++) {
				if(nums2[i]==nums3[j]) {
					s.add(nums2[i]);
				}
			}
		}
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			li.add(itr.next());
		}
		return li;
	}
	
	public static List<Integer>  better(int nums1[],int nums2[],int nums3[]) {
		 Set<Integer> set = new HashSet();
	        Set<Integer> result =  new HashSet();
	        for(int i : nums1) //add all number on nums1 to set
	            set.add(i);
	        for(int i : nums2) // findout if there any intersection with nums2
	            if(set.contains(i)) result.add(i);
	        for(int i : nums2) //lately add all numbers from nums2 to set.
	            set.add(i);
	        for(int i : nums3) // check if there is intersection with again for nums3
	            if(set.contains(i)) result.add(i);
	        return new ArrayList(result);
	}
	public static List<Integer>  better1(int nums1[],int nums2[],int nums3[]) {
		boolean[] bool1 = new boolean[101];
        boolean[] bool2 = new boolean[101];
        boolean[] bool3 = new boolean[101];

        for (int i : nums1) bool1[i] = true;
        for (int i : nums2) bool2[i] = true;
        for (int i : nums3) bool3[i] = true;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < bool1.length; i++) {
            if (bool1[i] && bool2[i]
                    || bool2[i] && bool3[i]
                    || bool1[i] && bool3[i]) {
                res.add(i);
            }
        }
        return res;
	}
}
