class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Initialize result array with -1, -1
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) {
                    result[0] = i; // Set the first occurrence
                }
                result[1] = i; // Update the last occurrence
            }
        }
        
        return result;
    }
}
