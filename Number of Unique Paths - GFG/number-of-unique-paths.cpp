//{ Driver Code Starts
//Initial template for C++
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template in C++

class Solution
{
    public:
     int dfs(int i,int j,int m,int n,vector<vector<int>>&dp){
        if(i>=m or j>=n ){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==m-1 and j==n-1){
            return 1;
        }
        return dp[i][j]=dfs(i+1,j,m,n,dp)+dfs(i,j+1,m,n,dp);
    }
    //Function to find total number of unique paths.
    int NumberOfPath(int m, int n)
    {
        vector<vector<int>>dp(m,vector<int>(n,-1));
        return dfs(0,0,m,n,dp);

    }
};


//{ Driver Code Starts.
int main()
{
    //taking total testcases
    int t;
    cin>>t;
    while(t--)
    {
        //taking dimensions of the matrix
        int a,b;
        cin>>a>>b;
        Solution ob;
        //calling NumberOfPath() function
        cout << ob.NumberOfPath(a,b) << endl;
    }
}


// } Driver Code Ends