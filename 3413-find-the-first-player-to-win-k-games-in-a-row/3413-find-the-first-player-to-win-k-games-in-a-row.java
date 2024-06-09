class Solution {
      public int findWinningPlayer(int[] A, int k) {
        int b = A[0], cur = 0, n = A.length, res = 0;
        for (int i = 1; i < n; ++i) {
            if (A[i] > b) {
                b = A[i];
                cur = 0;
                res = i;
            }
            if (++cur >= k) break;
        }
        return res;
    }
}