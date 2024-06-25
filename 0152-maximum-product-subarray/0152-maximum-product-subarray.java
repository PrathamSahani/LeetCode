class Solution {
    public int maxProduct(int[] nums) {
         int max=Integer.MIN_VALUE;
         for(int i=0; i<nums.length; i++){
             int cs =1;
             for(int j=i; j<nums.length; j++){
                 cs = cs*nums[j];
                 max = Math.max(max, cs); 
             }
         }
         return max;
    }
}