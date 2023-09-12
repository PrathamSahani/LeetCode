import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> min = new PriorityQueue<>((a, b)->a.getValue()-b.getValue());
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            min.add(entry);
            while(min.size()>k){
                min.poll();
            }
        }
        int res[] = new int[k];
        int idx =0;
        while(!min.isEmpty()){
            res[idx++] = min.poll().getKey();
        }
        return res;
    }
}
