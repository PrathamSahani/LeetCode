class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length, left =0, zero=0, rigth=0, ans =0;
        for(;rigth<n; rigth++){
            if(nums[rigth]==0){
                zero++;
            }
            while(zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            ans = Math.max(ans, rigth-left+1-zero);
        }
        return (ans==n)?ans-1:ans;


    }
}