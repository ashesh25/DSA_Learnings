package leetcode;

public class Minimum_Time_Type_Word_Using_Special_Typewriter_1974 {

	public static void main(String[] args) {
		System.out.println(minTimeToType("abc"));

	}
	
	
	public static int minTimeToType(String word) {
        int count = 0;
        char first = 'a';
        char c[] = word.toCharArray();
        for(int i = 0;i<c.length;i++) {
        	int diff = Math.abs(c[i]-first);
        	count = count + Math.min(diff,26-diff);
        	count++;
        	first = c[i];
        }
       
        
        return count;
    }
}
