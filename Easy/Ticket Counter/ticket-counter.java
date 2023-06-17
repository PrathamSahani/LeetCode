//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends

class Solution {
    public static int distributeTicket(int n,int K){
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=1;i<=n;i++){
            dq.offer(i);
        }
        int start=1,end=n;
        int k=0;
        while((end-start+1)>K){
            int i=0;
            if(k==0){
                start=start+K;
                while(i!=K){
                    dq.removeFirst();
                    i++;
                }
                k=1;
            }
            else{
                end=end-K;
                while(i!=K){
                    dq.removeLast();
                    i++;
                }
                k=0;
            }
        }

        int val=0;
        while(!dq.isEmpty()){
            if(k==0){
                val=dq.removeFirst();
            }
            else{
                val=dq.removeLast();
            }
        }
        return val;
    }
}