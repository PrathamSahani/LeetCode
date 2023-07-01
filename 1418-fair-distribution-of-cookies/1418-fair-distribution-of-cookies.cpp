
class Solution {
public:
    int n;
    vector<int> cookieCount; // This array tracks the count of cookies that ith children has

    int Utils(vector<int> &cookies,int cookieIdx,int k){
        // Base condition
        // That is-> All cookies have been distributed
        if(cookieIdx==n){
            int maxCookies=0;

            // Finding what is the maximum cookie count that some children have got
            for(int i=0;i<k;i++){
                maxCookies=max(maxCookies,cookieCount[i]);
            }
            return maxCookies;
        }

        int minUnfairness=INT_MAX; 

        // For the current Cookie i.e. cookie at cookieIdx, trying all possible options by giving current cookie to each each children    
        for(int i=0;i<k;i++){
            cookieCount[i]+=cookies[cookieIdx];
            minUnfairness=min(minUnfairness,Utils(cookies,cookieIdx+1,k));
            // Backtracking
            // So that the other options are not affected by this current option of giving current cookie to ith child
            cookieCount[i]-=cookies[cookieIdx];
        }

        // Returning the minimum of all options
        return minUnfairness;
        
    }
    
    int distributeCookies(vector<int>& cookies, int k) {
        n=cookies.size();
        cookieCount.resize(k,0);
        return Utils(cookies,0,k);

        //  Time Complexity-> O(k^cookies.length) -> O(8^8)
    }
};