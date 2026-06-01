package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram_242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isAnagram(String s, String t) {
       char c1[] = s.toCharArray();
       char c2[] = t.toCharArray();
       Map<Character, Integer> map1 = new HashMap<Character, Integer>();
       Map<Character, Integer> map2 = new HashMap<Character, Integer>();
       
       for(int i = 0; i < c1.length; i++) {
			if ( map1.containsKey(c1[i]) ) {
				map1.put(c1[i], map1.get(c1[i])+1);
			}
			else {
				map1.put(c1[i], 1);
			}
		}
       for(int i = 0; i < c2.length; i++) {
			if ( map2.containsKey(c2[i]) ) {
				map2.put(c2[i], map2.get(c2[i])+1);
			}
			else {
				map2.put(c2[i], 1);
			}
		}
       
       return map1.equals(map2);
    }

}
