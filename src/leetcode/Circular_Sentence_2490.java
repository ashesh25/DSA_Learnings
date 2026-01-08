package leetcode;

public class Circular_Sentence_2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eetcode";
		System.out.println(isCircularSentence(s));
	}
	
	public static boolean isCircularSentence(String sentence) {
		int n = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(n-1)) return false;
        for (int i = 1; i < n-1; i++) {
            if (sentence.charAt(i) == ' ') {
                if (sentence.charAt(i-1) != sentence.charAt(i+1)) return false;
            }
        }
        
    
        return true;
    }

}
