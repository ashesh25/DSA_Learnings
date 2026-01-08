package leetcode;

public class Permutation_Difference_between_Two_Strings_3146 {
	
	public static void main(String[] args) {
		String s = "abcde";
		String t = "edbac";
		System.out.println(findPermutationDifference(s,t));
	}
	
	public static int findPermutationDifference(String s, String t) {
        int diff = 0;
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        for(int i = 0; i < c1.length; i++) {
        	for(int j = 0; j < c2.length; j++) {
        		if(c1[i] == c2[j]) {
        			diff = diff + Math.abs(i-j);
        			break;
        		}
        	}
        }
        return diff;
    }
}
