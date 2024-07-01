import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Count occurrences of each number
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Check which numbers appear more than n/3 times
        for(int key : map.keySet()) {
            if(map.get(key) > nums.length / 3) {
                result.add(key);
            }
        }
        
        return result;
    }
}
