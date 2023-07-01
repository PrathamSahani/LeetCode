class Solution {
    private static boolean cash(int[] arr, int max, int day){
        int weight =0, days =1;
        for(int i=0; i<arr.length; i++){
            if(weight+arr[i]>max){
                days++;
                weight = arr[i];
            }else
            weight+=arr[i];
        }
        // System.out.println(weight+" "+max+" "+days);
        return days<=day;
            }
    
    public int shipWithinDays(int[] weights, int days) {
        int max =0;
        int sum =0;
        for(int i=0; i<weights.length; i++){
            max = Math.max(weights[i], max);
            sum+=weights[i];
        }
        int lo = max, hi = sum;
        if(days==weights.length)return max;
        int ans =-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(cash(weights, mid, days)){
                ans = mid;
                hi = mid-1;
            }else
            lo = mid+1;
        }
        return ans;
        
        
    }
}