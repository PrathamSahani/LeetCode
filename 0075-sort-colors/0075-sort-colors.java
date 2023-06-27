class Solution {
    public void sortColors(int[] nums) {
           int zero =0, first = nums.length-1,
            i=0;
            while(i<=first){
                if(nums[i]==0)
                    swap(nums, zero++, i++);
                
                else if(nums[i]==2)
                    swap(nums, first--, i);
                
                else
                    i++;
                
            }
    }

      public  void swap(int[] nums, int i, int j){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
      }
    
}