class Solution {
    int f(int i, int j , int [] a, int [][]dp){
        if(i>j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int maxi = Integer.MIN_VALUE;
        for(int k=i; k<=j; k++){
            int ans = a[i-1]*a[k]*a[j+1]+f(i, k-1, a, dp)+f(k+1, j, a, dp);
            maxi = Math.max(maxi, ans);
        }
        return dp[i][j] = maxi;
    }
    public int maxCoins(int[] a) {
       int n = a.length;
        int[] res = new int[n + 2];
        res[0] = 1;
        res[n + 1] = 1;
        System.arraycopy(a, 0, res, 1, n);
        int[][] dp = new int[n + 2][n + 2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(1, n, res, dp);
    }
}