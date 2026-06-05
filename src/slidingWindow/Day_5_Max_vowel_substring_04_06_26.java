package slidingWindow;

public class Day_5_Max_vowel_substring_04_06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abciiidef";
		int k = 3;
		maxVowels(s, k);
	}
	
	public static int maxVowels(String s, int k) {
		int max  =0;
		char c[] = s.toCharArray();
		int count =0;
		for(int i=0;i<k;i++) {
			if(getVowel(c[i])) {
				count++;
			}
		}
		max = count;
		for( int i = k; i < c.length;i++) {
			if(getVowel(s.charAt(i-k))) {
				count--;
			}
			if(getVowel(s.charAt(i))) {
				count++;
			}
			if(count>max)
				max=count;
		}
		return max;
    }
	
	public static boolean getVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

}
