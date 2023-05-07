//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends

class Sol
{
    int getCount (String S, int N)
    {
       int[] arr = new int[26];
       arr[S.charAt(0)-'a']++;
       for(int i=1; i<S.length(); i++){
           if(S.charAt(i)!=S.charAt(i-1)){
               int pos = S.charAt(i)-'a';
               arr[pos]++;
           }
       }int ans =0;
       for(int i=0; i<26; i++){
           if(arr[i]==N){
               ans++;
           }
       }return ans;
      
    }
}