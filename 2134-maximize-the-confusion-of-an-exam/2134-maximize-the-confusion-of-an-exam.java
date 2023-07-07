class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        int ans =0;
        int cnt = 0, i=0, j=0;
        while(i<s.length()){
            if(s.charAt(i)=='T')cnt++;
            while(cnt>k){
                if(s.charAt(j++)=='T')cnt--;
            }
            ans = Math.max(ans, i-j+1);
            i++;
        }
        cnt = 0; i = 0; j = 0;
        while(i < s.length()) {
            if(s.charAt(i) == 'F') cnt++;
            while(cnt > k) {
                if(s.charAt(j++) == 'F') cnt--;
            }
            ans = Math.max(ans, i-j+1);
            i++;
        }

        return ans;
        
    }
}