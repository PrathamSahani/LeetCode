//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


class Solution{
    static String longestPalin(String S){
        // code here
      if(S.length()==1){
          return S;
      }
      int index =0;String st="";
      for(int i=S.length(); i>0; i--){
          for(int j=0; j<S.length()-i+1; j++){
              st = S.substring(j, i+j);
              if(isPlaindrome(st)){
                  return st;
              }
          }
      }
      return "";
    }
    public static boolean isPlaindrome(String s){
        int i=0; int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}