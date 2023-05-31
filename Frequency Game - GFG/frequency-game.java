//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

// Position this line where user code will be pasted.

// Driver class with main function
class GFG {
    // Main function
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());

        // Iterating over testcases
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int arr[] = new int[n];

            String s[]=in.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            System.out.println(obj.LargButMinFreq(arr, n));
        }
    }
}
// } Driver Code Ends

class Solution {
    public static int LargButMinFreq(int arr[], int n) {
        Arrays.sort(arr);
        int dp[] = new int[arr[n-1]+1];
        for(int i=0;i<n;i++)
        dp[arr[i]]++;
       int min=Integer.MAX_VALUE;
       int max=0;
        for(int i=0;i<dp.length;i++)
        {
           if(dp[i]==0) 
           continue;
           else if(dp[i]<=min)
           {
               if(max<i)
               {
               min=dp[i];
               max=i;
               }
           }
        }
    return max;
        
    }
    
}