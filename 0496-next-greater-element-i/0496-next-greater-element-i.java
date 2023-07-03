class Solution {
    public static int solve(int s, int n, int []nums){
        for(int i=s; i<nums.length; i++){
            if(nums[i]>n){
                return nums[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums1[i] = solve(j, nums1[i], nums2);break;
                }
            }
        }
        return nums1;
    }
}