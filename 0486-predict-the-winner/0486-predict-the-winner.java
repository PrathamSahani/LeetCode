class Solution {
    public int f(int nums[], int l , int r, int dp[][]){
        if(dp[l][r]!=-1){
            return dp[l][r];
        }
        if(l==r)return nums[l];
        int left = nums[l]-f(nums, l+1, r, dp);
        int right = nums[r]-f(nums, l, r-1, dp);
        dp[l][r] = Math.max(left, right);
        return dp[l][r];
    }
    public boolean PredictTheWinner(int[] nums) {
        int dp[][]= new int[nums.length][nums.length];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return f(nums, 0, nums.length-1, dp)>=0;
    }
}