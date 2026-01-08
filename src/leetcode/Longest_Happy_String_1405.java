package leetcode;

public class Longest_Happy_String_1405 {
	
	public static void main(String[] args) {
		System.out.println(longestDiverseString(1,1,7));
	}
	
	public static String longestDiverseString(int a, int b, int c) {
		 StringBuilder sb = new StringBuilder();

	        int contA = 0, contB = 0, contC = 0;
	        int total = a + b + c;
	        for (int i = 0; i < total; i++) {
	            if ((a >= b && a >= c && contA != 2) || ((contB == 2 || contC == 2) && a > 0)) {
	                sb.append("a");
	                a--;
	                contA++;
	                contB = 0;
	                contC = 0;
	            } else if ((b >= a && b >= c && contB != 2) || ((contA == 2 || contC == 2) && b > 0)) {
	                sb.append("b");
	                b--;
	                contB++;
	                contA = 0;
	                contC = 0;
	            } else if ((c >= a && c >= b && contC != 2) || ((contA == 2 || contB == 2) && c > 0)) {
	                sb.append("c");
	                c--;
	                contC++;
	                contA = 0;
	                contB = 0;
	            }
	        }
	        return sb.toString();
    }
}
