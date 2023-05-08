//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int h = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.Solve(n,a,h);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int Solve(int N, int[] nums, int H) {
        // code here
        int l = 0, r = 1000000000;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(getsum(nums, mid)>H){
                l =mid+1;
            }else{
                r = mid-1;
            }
        }
        return l;
        
    }
    public static  int getsum(int nums[], int mid){
        int sum =0;
        for(int i=0;i<nums.length; i++){
            sum+= (nums[i]+mid-1)/mid;
        }
        return sum;
    }
}
        
