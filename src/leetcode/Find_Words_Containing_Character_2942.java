package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character_2942 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[] = {"leet","code"};
		char x = 'e';
		findWordsContaining(words,x);
	}
	
	 public static List<Integer> findWordsContaining(String[] words, char x) {
	        List<Integer> li = new ArrayList<Integer>();
	        for(int i = 0; i<words.length; i++){
	            String s = words[i];
	            char c[] = s.toCharArray();
	            for(int j = 0;j<c.length;j++){
	                if(c[j]==x){
	                    li.add(i);
	                    break;
	                }
	                
	            }
	        }
	        System.out.println(li);
	        return li;
	    }

}
