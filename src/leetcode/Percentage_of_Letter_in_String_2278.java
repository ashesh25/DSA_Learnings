package leetcode;

public class Percentage_of_Letter_in_String_2278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(percentageLetter("foobar",'o'));
	}
	
	public static int percentageLetter(String s, char letter) {
		double total = s.length();
		double count = 0;
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)==letter)
				count++;
		}
		double d = count/total;
		double result = d*100;
		return (int)result;
    }

}
