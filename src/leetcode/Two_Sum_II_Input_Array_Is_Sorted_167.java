package leetcode;

public class Two_Sum_II_Input_Array_Is_Sorted_167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {2,7,11,15};
		int target = 9;
		twoSum(n,target);
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int result[] = new int[2];
		int right = numbers.length-1;
		
		while(left<right) {
			if(numbers[left]+numbers[right]==target) {
				result[0] = left+1;
				result[1] = right+1;
				break;
			}
			else if (numbers[left]+numbers[right]>target){
				right --;
			}
			else
				left++;
		}
		return result;
    }

}
