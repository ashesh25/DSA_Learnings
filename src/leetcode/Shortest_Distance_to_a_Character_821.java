package leetcode;

import java.util.ArrayList;

public class Shortest_Distance_to_a_Character_821 {
	public static void main(String[] args) {
		String s = "aaba";
		char c = 'b';
		int a[] = new int[s.length()];
		a = shortestToChar(s,c);
		for(int i = 0;i<s.length();i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static int[] shortestToChar(String s, char c) {
        char c1[] = s.toCharArray();
        int c2[] = new int[s.length()];
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i = 0;i<c1.length;i++) {
        	if(c1[i]==c)
        		ar.add(i);
        }
        int j =0;
        for(int i =0;i<c2.length;i++) {
        	if(i<=ar.get(j) && j == 0) {
        		c2[i] = Math.abs(ar.get(j)-i);
        	}
        	else if(i<=ar.get(j) && j>0)
        		c2[i] = Math.min( Math.abs(ar.get(j)-i), Math.abs(ar.get(j-1)-i));
        	
        	else if(i>ar.get(j) && j != ar.size()-1) {
        		j++;
        		c2[i] = Math.min(Math.abs(ar.get(j-1)-i), Math.abs(ar.get(j)-i));
        	}
        	else if(i>ar.get(j) && j == ar.size()-1) {
        		c2[i] = Math.abs(ar.get(j)-i);
        	}
        }
        return c2;
    }
}
