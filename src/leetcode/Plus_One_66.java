package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Plus_One_66 {
	
	public static void main(String[] args) {
		int a[] = {9, 9};
		int result[] = plusOne(a);
		for( int i = 0; i < result.length; i++) {
			System.out.print(result[i]+ " ");
		}
	}
	
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
        
    }
}
