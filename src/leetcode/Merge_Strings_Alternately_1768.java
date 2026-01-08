package leetcode;

public class Merge_Strings_Alternately_1768 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mergeAlternately1("ab","pqrs"));
	}
	
	
	public static String mergeAlternately(String word1, String word2) {
        String result = "";
		if(word1.length()>word2.length()) {
			for(int i =0 ;i< word2.length();i++){
				result = result + word1.charAt(i)+word2.charAt(i);
			}
			result = result + word1.substring(word2.length());
		}
		
		if(word1.length()<word2.length()) {
			for(int i =0 ;i< word1.length();i++){
				result = result + word1.charAt(i)+word2.charAt(i);
			}
			result = result + word2.substring(word1.length());
		}
		
		if(word1.length()==word2.length()) {
			for(int i =0 ;i< word1.length();i++){
				result = result + word1.charAt(i)+word2.charAt(i);
			}
			//result = result + word2.substring(word1.length());
		}
		
		
		return result;
    }
	
	public static String mergeAlternately1(String word1, String word2) {
		
		 StringBuilder sb = new StringBuilder("");
	        int len1 = word1.length(), len2 = word2.length();
	        if(len1>=len2){
	            for(int i=0;i<len1;i++){
	                sb.append(word1.charAt(i));
	                if(i<len2){
	                    sb.append(word2.charAt(i));
	                }
	            }
	        }
	        else{
	             for(int i=0;i<len2;i++){
	                if(i<len1){
	                    sb.append(word1.charAt(i));
	                }
	                 sb.append(word2.charAt(i));
	            }
	        }
	        return sb.toString();
	}
	

}
