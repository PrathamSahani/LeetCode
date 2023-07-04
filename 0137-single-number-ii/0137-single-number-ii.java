class Solution {
    public int singleNumber(int[] nums) {
           Arrays.sort(nums);
           if(nums.length==1)return nums[0];
           for(int i=0; i<nums.length; i++){
               if(i==nums.length-1){
                   return nums[i];
               }
               if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
                   i = i+2;
               }else{
                   return nums[i];
               }
           }
           return -1;
    }
}