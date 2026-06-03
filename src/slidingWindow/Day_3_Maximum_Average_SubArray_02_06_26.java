package slidingWindow;

public class Day_3_Maximum_Average_SubArray_02_06_26 {

	public static void main(String[] args) {
		/*
		 * int n[] = {1,12,-5,-6,50,3}; int k = 4; int largestSum = 0; int count = 0;
		 * int sum = 0; double average; for(int i = 0; i< n.length;i++){ sum = sum +
		 * n[i];
		 * 
		 * count++; if(count==k) { if(sum > largestSum) { largestSum = sum; } i = i-k+1;
		 * sum = 0; count = 0; } } average = (double)largestSum/k;
		 * System.out.println(average);
		 */
		
		
	}
	public double findMaxAverage(int[] nums, int k) {
	       int n = nums.length;
	        int sum = 0;
	        for (int i = 0; i < k; i++) {
	            sum += nums[i];
	        }
	        int maxSum = sum;
	        for (int i = k; i < n; i++) {
	            sum = sum - nums[i - k] + nums[i];
	            if (sum > maxSum) {
	                maxSum = sum;
	            }
	        }
	        return (double) maxSum / k;
	    }
}

