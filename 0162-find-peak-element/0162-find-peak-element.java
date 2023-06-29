class Solution {
    public int findPeakElement(int[] nums) {
       int count =0;
    
       for(int i=1; i<nums.length; i++){
           if(nums[i-1]<nums[i]){
               count = i;
           }
       }
       return count;
    }
}