class Solution {
public static int solve(int ind, int arr[], int[] dp){
		if(ind<0)return 0;
		if(ind==0)return arr[ind];
		if(dp[ind]!=-1)return dp[ind];
		int pick = arr[ind]+solve(ind-2, arr, dp);
		int np  = 0+solve(ind-1, arr, dp);
		return dp[ind]= Math.max(np, pick);
	}
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(nums.length-1, nums, dp);
   
 
    }
}