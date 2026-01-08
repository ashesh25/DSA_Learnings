package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Count_the_Digits_That_Divide_a_Number_2520 {
	public static void main(String[] args) {
		System.out.println(countDigits(121));
	}
	
	public static int countDigits(int num) {
        int count =0;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        int num1 = num;
        while(num1>0){
            ar.add(num1%10);
            num1 = num1/10;
        }
        Iterator<Integer> itr = ar.iterator();
        while(itr.hasNext()){
            if(num%itr.next()==0)
                count++;
        }
        return count;
    }
}
