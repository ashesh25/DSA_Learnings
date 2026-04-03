package leetcode;

public class Weighted_Word_Mapping_3838 {

	public static void main(String[] args) {
		String words[] = {"abcd","def","xyz"};
		int weights[] = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
		System.out.println(mapWordWeights(words, weights));
	}
	
	public static String mapWordWeights(String[] words, int[] weights) {
		String result = "";
		int arr[] = new int[words.length];
		for( int i = 0; i < words.length; i++ ) {
			String word = words[i];
			char c[] = word.toCharArray();
			int sum = 0;
			for(int j = 0; j < c.length; j++ ) {
				sum = sum + weights[c[j]-97];
			}
			arr[i] = sum%26;
		}
		for( int i = 0; i < arr.length; i++ ) {
			char c = (char) Math.abs(arr[i]-122);
			result = result + String.valueOf(c);
		}
		
		return result;
	}
}
