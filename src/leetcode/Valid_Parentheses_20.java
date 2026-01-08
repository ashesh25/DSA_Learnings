package leetcode;

public class Valid_Parentheses_20 {
	public static void main(String[] args) {
		String s = "{[()}]";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                // If the string becomes empty, it indicates all brackets are matched.
                return s.isEmpty();
            }
        }

    }
}
