package leetcode;

import java.util.ArrayList;

public class Baseball_Game_682 {
	public static void main(String[] args) {
		String a[] = {"1","C"};
		System.out.println(calPoints(a));
	}
	
	public static int calPoints(String[] ops) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
       int sum = 0;
        for(int i = 0;i<ops.length;i++) {
        	if(ops[i]=="C") {
        		ar.remove(ar.size()-1);
        	}
        	else if(ops[i]=="D") {
        		ar.add(2*ar.get(ar.size()-1));
        	}
        	else if(ops[i]=="+") {
        		int sum1 = ar.get(ar.size()-1)+ar.get(ar.size()-2);
        		ar.add(sum1);
        	}
        	else {
        		ar.add(Integer.parseInt(ops[i]));
        	}
        }
        for(int i:ar) {
        	sum = sum + i;
        }
		return sum;
    }
}
