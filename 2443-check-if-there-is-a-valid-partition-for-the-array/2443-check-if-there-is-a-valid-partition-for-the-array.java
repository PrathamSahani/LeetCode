public class Solution {
    public boolean validPartition(int[] nums) {
        int n = nums.length;

        // If the array has only one element, then it's not possible to partition it into valid subarrays.
        if (n == 1) return false;

        // Initialization for the first three values
        boolean[] dp = {true, false, n > 1 ? nums[0] == nums[1] : false};

        for (int i = 2; i < n; i++) {
            boolean current_dp = false;

            // Check for 2 equal elements
            if (nums[i] == nums[i-1] && dp[1]) {
                current_dp = true;
            }
            // Check for 3 equal elements
            else if (i-2 >= 0 && nums[i] == nums[i-1] && nums[i] == nums[i-2] && dp[0]) {
                current_dp = true;
            }
            // Check for 3 consecutive increasing elements
            else if (i-2 >= 0 && nums[i] - nums[i-1] == 1 && nums[i-1] - nums[i-2] == 1 && dp[0]) {
                current_dp = true;
            }

            // Move the window forward
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = current_dp;
        }

        return dp[2];
    }
}