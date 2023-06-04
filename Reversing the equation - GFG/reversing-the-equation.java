//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution
{
   
    String reverseEqn(String S)
    {
        Stack<String> stack = new Stack<>();
        int i=0 , n= S.length();
        while(i<n){
            String s="";
            while(i<n && S.charAt(i) >='0' && S.charAt(i) <='9'){
                s+= S.charAt(i);
                i++;
            }
            stack.push(s);
            if(i<n){
                stack.push(S.charAt(i)+"");
                i++;
            }
        }
        StringBuilder sb = new StringBuilder("");
        while(!stack.isEmpty()) sb.append(stack.pop());
        return sb.toString();
    }
}