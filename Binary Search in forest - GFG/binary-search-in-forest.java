//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    public static void main (String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            
            int tree[]= new int[n];
            for(int i=0; i<n; i++)
                tree[i] = in.nextInt();
            int k = in.nextInt();
            
            Solution x = new Solution();
            System.out.println( x.find_height(tree,n,k) );
        }
	}
}
// } Driver Code Ends



class Solution
{
    static int find_height(int tree[], int n, int k)
    {
      int low =0;
      Arrays.sort(tree);
      while(low<tree[n-1]){
          int sum =0;
          for(int i=0; i<n; i++){
              if(tree[i]>low){
                  sum+=tree[i]-low;
              }
              
          }
          if(sum==k){
              return low;
          }
          low++;
      }
      return -1;
      
        
    }
}