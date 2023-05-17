//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends



// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // // code here
      long[][] arr = new long[n][n];
        for(int i=0; i<n; i++){
            arr[i][0]=1;
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                arr[i][j] = (arr[i-1][j-1]+arr[i-1][j])%1000000007;
            }
        }
        ArrayList<Long> list = new ArrayList<>();
        for(int i=n-1; i<n; i++){
            for(int j=0; j<n; j++){
                list.add(arr[i][j]);
            }
        }
        return list;
        
    }
}