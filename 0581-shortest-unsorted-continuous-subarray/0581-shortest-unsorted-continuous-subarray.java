class Solution {
    public int findUnsortedSubarray(int[] nums) {
         int res[] = nums.clone();
         Arrays.sort(res);
         int end =0;
         int start =0;
         for(int i=0; i<nums.length; i++){
             if(res[i]!=nums[i]){
                 start =i;
                 break;
             }
         }
         for(int i=nums.length-1; i>=0; i--){
             if(res[i]!=nums[i]){
                 end= i;
                 break;
             }
         }
         if(end==0 && start==0){
             return 0;
         }
         return end-start+1;
    }
}