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
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java
class Solution{
    int longestUniqueSubsttr(String s){
       
         int max = Integer.MIN_VALUE;
         int i=0;
         ArrayList<Character> set = new ArrayList<>();
         while(i<s.length()){
             if(!set.contains(s.charAt(i))){
                 set.add(s.charAt(i));
                 i++;
             }else{
                 max =Math.max(max, set.size());
                 set.remove(0);
             }
         }
         max = Math.max(max, set.size());
         return max;
         

        }
}