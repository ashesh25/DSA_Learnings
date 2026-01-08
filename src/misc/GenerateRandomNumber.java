package misc;


public class GenerateRandomNumber {
	public static void main(String[] args) {
		int min = 1;
		int max = 2281;
		int result = (int)(Math.random()*(max-min+1)+min); 
		System.out.println(result);
	}
}
