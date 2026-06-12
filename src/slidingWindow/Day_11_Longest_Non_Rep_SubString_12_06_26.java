package slidingWindow;

import java.util.HashSet;

public class Day_11_Longest_Non_Rep_SubString_12_06_26 {


    public static void main(String[] args) {
        String s = "abcbbe";
        int left = 0;
        int maxLenght = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int right = 0; right < s.length(); right++) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLenght = Math.max(maxLenght, set.size());
            String s1 = set.toString();
            System.out.println(s1);
        }
        System.out.println(maxLenght);
    }
}

/*Minimum Size Subarray Sum
Longest Repeating Character Replacement
Maximum Number of Vowels in a Substring of Given Length
Maximum Average Subarray I */
