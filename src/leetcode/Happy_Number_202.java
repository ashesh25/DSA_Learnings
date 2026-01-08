package leetcode;

public class Happy_Number_202 {
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
	
	public static boolean isHappy(int n) {
        int sumOfSquare = 0;
        int num2 = n;
        boolean flag = false;
        while(sumOfSquare!=1){
            while(n>0){
                int num1 = 0;
                num1 = n%10;
                sumOfSquare = sumOfSquare + num1*num1;
                n = n/10;
            }
            if(sumOfSquare == 1){
                flag = true;
                break;
            }
            else if(sumOfSquare == num2)
                flag = false;
            else {
                n = sumOfSquare;
                sumOfSquare = 0;
            }
        }
        return flag;
    }
}
