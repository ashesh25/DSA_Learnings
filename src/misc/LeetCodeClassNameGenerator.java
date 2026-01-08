package misc;

public class LeetCodeClassNameGenerator {

	public static void main(String[] args) {
		String input = "3289. The Two Sneaky Numbers of Digitville";
		String s1[] = input.split("\\.");
		String s2 = s1[0];
		String s3 = s1[1].trim();
		String s4[] = s3.split(" ");
		String s5 = "";
		for(int i = 0;i<s4.length-1;i++) {
			s5= s5 + s4[i]+ "_";
		}
		s5 = s5 + s4[s4.length-1]+"_"+s2;
		System.out.println(s5);
	}
	
	

}
