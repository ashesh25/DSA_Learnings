package leetcode;

public class DI_String_Match_942 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = diStringMatch("IDID");
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static int[] diStringMatch(String s) {
        int a[] = new int[s.length()+1];
        int b = a.length-1;
        int c = 0;
        for(int i = 0;i<s.length();i++) {
        	if(s.charAt(i)=='I') {
        		a[i] = c;
        		c++;
        	}
        	else {
        		a[i] = b;
        		b--;
        	}
        }
        a[a.length-1] = b;
        
        
        return a;
    }
	
	

}
