class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
          String str = "";
          for(int i=s.length(); i>=0; i--){
              for(int j=0; j<s.length()-i+1; j++){
                  str = s.substring(j, i+j);
                  if(plain(str)){
                      return str;
                  }
              }
          }
          return "";
    }
    public boolean plain(String s){
        int i=0, j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }else{
                i++; j--;
                        }
        }
        return true;
    }
}