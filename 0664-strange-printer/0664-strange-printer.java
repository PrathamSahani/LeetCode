class Solution {
    public int strangePrinter(String s) {
        if (s.length() == 0) return 0;
        int n = s.length();
        int[][] dp = new int[n][n];
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    int temp = dp[i][j - 1] + 1;
                    for (int m = j - 1; m >= i; m--) {
                        if (s.charAt(m) == s.charAt(j)) {
                            if (m > 0 && temp > dp[i][m - 1] + dp[m][j - 1]) {
                                temp = dp[i][m - 1] + dp[m][j - 1];
                            } else if (m == 0) {
                                temp = dp[0][j - 1]; // for special cases
                            }
                        }
                    }
                    dp[i][j] = temp;
                }
            }
        }
        return dp[0][n - 1];
    }
}
