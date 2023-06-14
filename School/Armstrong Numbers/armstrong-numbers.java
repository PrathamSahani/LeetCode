//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int temp=n , res =0, rem;
      
        while(temp>0){
            rem = temp%10;
            res = res+(rem*rem*rem);
            temp/=10;
        }
        if(n==res){
            return "Yes";
        }else{
            return "No";
        }
  
    
    }
}