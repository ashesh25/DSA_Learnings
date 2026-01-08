package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Kth_Distinct_String_Array_2053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"a","b","a"};
		System.out.println(kthDistinct(a,3));
	}
	
	 public static String kthDistinct(String[] arr, int k) {
	      
		 Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		 for(int i = 0;i<arr.length;i++) {
			 if(map.containsKey(arr[i])) {
				 map.put(arr[i], map.get(arr[i])+1);
			 }
			 else {
				 map.put(arr[i], 1);
			 }
		 }
		 int index =1;
		 String result = "";
		for(Map.Entry<String,Integer> m : map.entrySet()) {
			if(m.getValue()==1 && index == k) {
				result = m.getKey();
			}
			if(m.getValue() ==1 ) {
				index++;
			}
	
		}
		 
		 
		 
		 return result;
	    }

}
