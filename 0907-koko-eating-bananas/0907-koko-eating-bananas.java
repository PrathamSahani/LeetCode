class Solution {
    int findMax(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }
    int solve(int arr[], int hour){
        int ans =0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            ans+= Math.ceil(((double)arr[i])/(double)hour);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1, high = findMax(piles);
       while(low<=high){
           int mid = (low+high)/2;
           int ans = solve(piles, mid);
           if(ans<=h){
               high = mid-1;
           }else{
               low = mid+1;
           }

       }
       return low;
    }
}