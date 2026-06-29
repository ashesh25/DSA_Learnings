package misc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Day_17_Kth_Largest_Element_29_06_26 {

    public static void main(String[] args) {
        int nums[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static int priorityQueue(int nums[], int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();    
    }
}
