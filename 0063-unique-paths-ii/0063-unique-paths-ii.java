class Solution {
    public static int f(int i, int j, int dp[][], int n[][]){
        if(i>=0 && j>=0 && n[i][j]==1){
            return 0;
        }
        if(i==0 && j==0)return 1;
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int up = f(i-1, j, dp, n);
        int left = f(i, j-1, dp, n);
        return dp[i][j] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] b) {
         int n = b.length;
         int m = b[0].length;
         int dp[][] = new int[n][m];
         for(int row[]: dp){
             Arrays.fill(row, -1);
         }
         return f(n-1, m-1, dp, b);


    }
}