package twoPointer;

public class Day_4_Valid_Palindrome_03_06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		String s1 = "";
		for(int i = 0 ; i < s.length(); i++) {
			if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
				s1 =s1 + s.charAt(i);
			}
		}
		String s2 = s1.toLowerCase();
		StringBuffer sb = new StringBuffer(s2);
		if(s2.equals(sb.reverse().toString()))
			System.out.println(true);
		else
			System.out.println(false);
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {

	    int left = 0;
	    int right = s.length() - 1;

	    while(left < right) {

	        while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
	            left++;
	        }

	        while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
	            right--;
	        }

	        while(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {

	            return false;
	        }

	        left++;
	        right--;
	    }

	    return true;
	}

}
