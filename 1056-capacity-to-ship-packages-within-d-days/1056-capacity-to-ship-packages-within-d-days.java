class Solution {
    public static int fund(int arr[], int d){
        int day =1;
        int ans =0;
        for(int i=0; i<arr.length; i++){
            if(ans+arr[i]<=d){
                ans+=arr[i];
            }else{
                day++;
                ans = arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low =0, high = 0;
        for(int i=0; i<weights.length; i++){
            low = Math.max(low, weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid = (low+high)/2;
            int ans = fund(weights, mid);
            if(ans<=days){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }return low;
    }
}