class Solution {
    public static int f(int [] arr, int ind, int T, int[][] dp){
        if(ind==0){
            if(T%arr[0]==0)return 1;
            else 
            return 0;
        }
        if(dp[ind][T]!=-1)return dp[ind][T] ;
        int nottake = f(arr, ind-1, T, dp);
        int take =0;
        if(arr[ind]<=T){
            take  = f(arr, ind, T-arr[ind], dp);
        }
        return dp[ind][T] = nottake +take;
    }
    public int change(int T, int[] arr) {
        int n = arr.length;
        int dp[][] = new int[n][T+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return f(arr , n-1, T, dp);
    }
}