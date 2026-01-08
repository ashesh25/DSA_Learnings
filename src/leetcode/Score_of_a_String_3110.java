package leetcode;

public class Score_of_a_String_3110 {
	
	public static void main(String[] args) {
		String s = "zaz";
		scoreOfString(s);
	}
	
	public static int scoreOfString(String s) {
		int result = 0;
		char c[] = s.toCharArray();
        for(int i = 0; i <c.length-1; i++) {
        	 int a = Math.abs((int)c[i] - (int)c[i+1]);
        	 result = result + a;
        }
        //System.out.println(result);
        return result;
    }
}
