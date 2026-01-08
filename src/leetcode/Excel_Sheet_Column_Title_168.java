package leetcode;

public class Excel_Sheet_Column_Title_168 {
	
	public static void main(String[] args) {
		System.out.println(convertToTitle(1501));
	}
	
	public static String convertToTitle(int columnNumber) {
		 StringBuilder result = new StringBuilder();

	        while(columnNumber > 0) {
	            columnNumber--;
	            int remainder = columnNumber%26;
	            char currentChar = (char)(remainder + 'A');
	            result.append(currentChar);
	            columnNumber/=26;
	        }

	        return result.reverse().toString();
    }
}
