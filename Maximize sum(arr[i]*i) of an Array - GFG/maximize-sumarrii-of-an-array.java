//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.Maximize(a,n));
        }
        
	}
}

// } Driver Code Ends


class Solution{
    
    int Maximize(int arr[], int n)
    {    
       long sum =0;
       Arrays.sort(arr);
       for(int i=0; i<arr.length; i++){
           sum+=(long)arr[i]*i;
       }
       return (int)(sum%(1000000007));
     
    }   
}

