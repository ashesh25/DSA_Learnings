package leetcode;

import java.util.HashSet;

public class Longest_Substring_3 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        int maxLenght = 0;

        for(int right = 0; right < s.length(); right ++) {
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLenght  = Math.max(maxLenght, set.size());   
            

        }
        return maxLenght;
    }
}
