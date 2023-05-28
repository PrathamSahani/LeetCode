//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends





class Solution {
    int countTriplet(int arr[], int n) {
        // code here
   Arrays.sort(arr);int count =0;
   for(int i=n-1; i>=2; i--){
       int l=0, r= i-1;
       while(l<r){
           if(arr[l]+arr[r] ==arr[i]){
               count++;l++;r--;
           }else if(arr[l]+arr[r]<arr[i]){
               l++;
           }else{
               r--;
           }
       }
       
   }
   return count;
}
}