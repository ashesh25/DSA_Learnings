package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note_383 {

	public static void main(String[] args) {
		
		canConstruct("aa","aab");
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map1 = new HashMap<>();
		
		for( int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);
			map.put(c, map.getOrDefault(c, 0) +1);
		}
		
		for( int i = 0; i < magazine.length(); i++) {
			char c = magazine.charAt(i);
			if (map.containsKey(c) && map.get(c) != 0) {
				map.put(c, map.get(c) -1);
			}
			if(map.containsKey(c) && map.get(c) == 0) {
				map.remove(c, 0);
			}
		}
		
		if(map.isEmpty())
			return true;
		else
			return false;
		
		
		
    }
}
