package hashMap;


public class Day_10_Find_Target_Indexes_11_06_26 {

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        searchRange(nums, target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = firstOccurance(nums, target);
        arr[1] = lastOccurance(nums, target);
        return arr;
    }

    public static int firstOccurance(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int answer = -1;
        while(left<=right){
            int mid = left + (right-left)/2;

            if(target == nums[mid]){
                answer = mid;
                right = mid -1;
            }
            else if(target<nums[mid]){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return answer;
    }

    public static int lastOccurance(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int answer = -1;
        while(left<=right){
            int mid = left + (right-left)/2;

            if(target == nums[mid]){
                answer = mid;
                left = mid + 1;
            }
            else if(target<nums[mid]){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return answer;
    }
}
