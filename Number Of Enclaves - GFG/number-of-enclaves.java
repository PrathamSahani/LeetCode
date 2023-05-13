//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.numberOfEnclaves(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0; i<m; i++){
            dfs(grid, i, 0);
            dfs(grid, i, n-1);
        }
        for(int j=0; j<n; j++){
            dfs(grid, 0, j);
            dfs(grid, m-1, j);
        }
        int count =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 | j>=grid[0].length || grid[i][j]!=1){
            return ;
        }
        grid[i][j] =-1;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}











