//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            String ans = ob.is_palindrome(n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int sum =0, s=n;
        while(n>0){
            int d = n%10;
            sum = sum*10+d;
            n/=10;
        }
       if(sum==s){
           return "Yes";
       }
       return "No";

    }
}