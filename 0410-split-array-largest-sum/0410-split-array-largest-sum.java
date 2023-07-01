class Solution {
    public boolean isPossible(int[] nums, int mid, int k){
        int count =1;
        int sum =0;
        for(int i=0 ; i<nums.length; i++){
            sum+=nums[i];
            if(sum>mid){
                count++;
                sum = nums[i];
            }
        }
        return count<=k;
    }
    public int splitArray(int[] nums, int k) {
        if(k>nums.length)return -1;
        int max =0, sum =0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            max = Math.max(max, nums[i]);
        }     
        int low = max, high = sum, ans =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(isPossible(nums, mid, k)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}