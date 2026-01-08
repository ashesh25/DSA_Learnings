package leetcode;

import java.util.Arrays;

public class CheckAllAAppearsBeforeAllB_2124 {
	public static void main(String[] args) {
		System.out.println(checkString1("aaaabaaaa"));
	}
	
	public static boolean checkString(String s) {
       char c[] = s.toCharArray();
       Arrays.sort(c);
       String b ="";
       for(int i = 0;i<c.length;i++) {
    	   b = b + c[i];
       }
       
       if(s.equals(b)) {
    	   return true;
       }
       else
    	   return false;
    }
	
	public static boolean checkString2(String s) {
	    boolean flag = false;
	    boolean result = true;
	    for(int i=0;i<s.length();i++) {
	    	if(s.charAt(i)=='a' && flag == true) {
	    		result = false;
	    		break;
	    	}
	    	if(s.charAt(i)=='b') {
	    		flag = true;
	    		result = true;
	    	}
	    }
	    return result;
	  }
	public static boolean checkString1(String s) {
		return !s.contains("ba");
	  }
	 public boolean checkStrin3(String s) {
	       for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i)=='b'){
	                if(s.charAt(i+1)=='a') return false;
	            }
	        }
	        return true;
	    }
	
	
}
