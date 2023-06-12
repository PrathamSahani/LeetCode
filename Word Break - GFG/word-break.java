//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        if(A.length()==0)return 1;
        for(int i=0; i<A.length(); i++){
            String word = A.substring(0, i+1);
            if(B.contains(word)){
                int ans = wordBreak(A.substring(i+1), B);
                if(ans==1)
                return 1;
            }
        }
        return 0;
    }
}