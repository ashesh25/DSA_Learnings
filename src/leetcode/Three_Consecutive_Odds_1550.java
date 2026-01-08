package leetcode;

public class Three_Consecutive_Odds_1550 {
	
	public static void main(String[] args) {
		int a[] = {102,780,919,897,901};
		//threeConsecutiveOdds(a);
		System.out.println(isOdd(a[3]));
	}
	
	public static boolean threeConsecutiveOdds(int[] arr) {
        boolean flag = false;
        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
        	if(isOdd(arr[i])) {
        		counter++;
        	}
        	else {
        		counter = 0;
        	}
        	if(counter == 3) {
        		break;
        	}
        	
        }
        if(counter>=3) {
        	flag = true;
        }
        System.out.println(flag);
        return flag;
    }
	
	public static boolean isOdd(int a) {
		if(a%2!=0)
			return true;
		else
			return false;
		
	}
}
