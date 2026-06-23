package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class Day_16_Top_K_Elements_23_06_26 {

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        topKFrequent(nums, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {

        //int arr[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            map.put(nums[i],1);
        }
        PriorityQueue<Integer> pq =
        new PriorityQueue<>(
            (a,b) -> map.get(a)-map.get(b)
        );

    for(int num : map.keySet()){

        pq.add(num);

        if(pq.size() > k){
            pq.poll();
        }
    }

    int[] result = new int[k];

    for(int i = k-1; i >= 0; i--){
        result[i] = pq.poll();
    }

    return result;

    }
}
