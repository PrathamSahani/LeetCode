//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
public:
    int maxEqualSum(int N1,int N2,int N3,vector<int> &S1,vector<int> &S2,vector<int> &S3){
        int ans=0;
        int i=N1-1,j=N2-1,k=N3-1;
        int sum1=S1[i],sum2=S2[j],sum3=S3[k];
        while(i>=0 && j>=0 && k>=0)
        {
            int maxi=max(sum1,max(sum2,sum3));
            if(sum1==maxi && sum2==maxi && sum3==maxi) 
            {
                ans=max(ans,maxi);
                i--;j--;k--;
                sum1+=S1[i];
                sum2+=S2[j];
                sum3+=S3[k];
                continue;
            }
            if(sum1<maxi)
            {
                if(i-1>=0) sum1+=S1[i-1];
                i--;
                
            }
            if(sum2<maxi)
            {
                if(j-1>=0) sum2+=S2[j-1];
                j--;
                
            }
            if(sum3<maxi)
            {
                if(k-1>=0) sum3+=S3[k-1];
                k--;
            }
        }
        if(sum1==sum2 && sum2==sum3) 
            {
                ans=max(ans,sum1);
            }
        
        return ans;
    }
};

//{ Driver Code Starts.

int main(){
    
    int t;
    cin>>t;
    while(t--){
        int n1,n2,n3;
        cin>>n1>>n2>>n3;
        vector<int> s1(n1),s2(n2),s3(n3);
        for(int i=0;i<n1;i++){
            cin>>s1[i];
        }
        for(int i=0;i<n2;i++){
            cin>>s2[i];
        }
        for(int i=0;i<n3;i++){
            cin>>s3[i];
        }
        Solution ob;
        int ans=ob.maxEqualSum(n1,n2,n3,s1,s2,s3);
        cout<<ans<<endl;
    }
    
    return 0;
}
// } Driver Code Ends