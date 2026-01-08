package leetcode;

public class Check_Word_Equals_Summation_Two_Words_1880 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSumEqual1("f","f","ba"));
	}
	
	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		String first = "";
		String Second = "";
		String target = "";
		boolean result = false;
		char c1[] = firstWord.toCharArray();
		char c2[] = secondWord.toCharArray();
		char c3[] = targetWord.toCharArray();
		for(int i = 0;i<c1.length;i++) {
			switch(c1[i]) {
			case 'a':
				first = first + "0";
				break;
			case 'b':
				first = first + "1";
				break;
			case 'c':
				first = first + "2";
				break;
			case 'd':
				first = first + "3";
				break;
			case 'e':
				first = first + "4";
				break;
			case 'f':
				first = first + "5";
				break;
			case 'g':
				first = first + "6";
				break;
			case 'h':
				first = first + "7";
				break;
			case 'i':
				first = first + "8";
				break;
			case 'j':
				first = first + "9";
				break;
			}
			
		}
		for(int i = 0;i<c2.length;i++) {
			switch(c2[i]) {
			case 'a':
				Second = Second + "0";
				break;
			case 'b':
				Second = Second + "1";
				break;
			case 'c':
				Second = Second + "2";
				break;
			case 'd':
				Second = Second + "3";
				break;
			case 'e':
				Second = Second + "4";
				break;
			case 'f':
				Second = Second + "5";
				break;
			case 'g':
				Second = Second + "6";
				break;
			case 'h':
				Second = Second + "7";
				break;
			case 'i':
				Second = Second + "8";
				break;
			case 'j':
				Second = Second + "9";
				break;
			}
		}
		for(int i = 0;i<c3.length;i++) {
			switch(c3[i]) {
			case 'a':
				target = target + "0";
				break;
			case 'b':
				target = target + "1";
				break;
			case 'c':
				target = target + "2";
				break;
			case 'd':
				target = target + "3";
				break;
			case 'e':
				target = target + "4";
				break;
			case 'f':
				target = target + "5";
				break;
			case 'g':
				target = target + "6";
				break;
			case 'h':
				target = target + "7";
				break;
			case 'i':
				target = target + "8";
				break;
			case 'j':
				target = target + "9";
				break;
			}
		}
		
		int a = Integer.parseInt(first);
		int b = Integer.parseInt(Second);
		int c = Integer.parseInt(target);
		if(a+b==c)
			return true;
		else
			return false;
		
		
    }
	
	public static boolean isSumEqual1(String firstWord, String secondWord, String targetWord) {
		String s1="",s2="",s3="";
        for(int i=0;i<firstWord.length();i++){
            s1 = s1 + (Character.getNumericValue(firstWord.charAt(i))-10);
        }
        for(int i=0;i<secondWord.length();i++){
            s2 = s2 + (Character.getNumericValue(secondWord.charAt(i))-10);
        }
        for(int i=0;i<targetWord.length();i++){
            s3 = s3 + (Character.getNumericValue(targetWord.charAt(i))-10);
        }
        return Integer.valueOf(s1)+Integer.valueOf(s2) == Integer.valueOf(s3);
	}
	public static boolean isSumEqual2(String firstWord, String secondWord, String targetWord) {
		int f = 0;
        int s = 0;
        int t = 0;
        for(char c : firstWord.toCharArray()) f = f * 10 + (c - 'a');
        for(char c : secondWord.toCharArray()) s = s * 10 + (c - 'a');
        for(char c : targetWord.toCharArray()) t = t * 10 + (c - 'a');
        return (f + s == t);
	}

}
