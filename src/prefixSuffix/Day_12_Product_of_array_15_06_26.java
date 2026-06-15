package prefixSuffix;

public class Day_12_Product_of_array_15_06_26 {


    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        productExceptSelf1(nums);
    }

    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;

    int[] answer = new int[n];

    answer[0] = 1;

    // Left products
    for(int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }

    int rightProduct = 1;

    // Right products
    for(int i = n - 1; i >= 0; i--) {
        answer[i] = answer[i] * rightProduct;
        rightProduct *= nums[i];
    }

    return answer;
    }



    public static int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(j==i) {
                    continue;
                }
                if( nums[j]!=0) {
                    product = product * nums[j];
                }
                else
                    product = 0;
            }
            arr[i] = product;
        }
        return arr;
    }
    
    
}

/*Running Sum of 1d Array
Find Pivot Index
Range Sum Query - Immutable
Trapping Rain Water */
