class Solution
{
    public int[] getAverages(int[] nums, int k)
    {
        if(k==0)return nums;
        int N = nums.length;
        long[] sum = new long[N];
        sum[0] = nums[0];
        for(int i=1; i<N; i++){
            sum[i]= sum[i-1]+nums[i];
        }
        int[] res = new int[N];
        Arrays.fill(res, -1);
        for(int i=k; i<N-k; i++){
            long temp= (sum[i+k]-sum[i-k]+nums[i-k])/(2*k+1);
            res[i] = (int)temp;
        }
        return res;
     
    }
}