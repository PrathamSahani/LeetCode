class Solution {
    public boolean repeatedSubstringPattern(String s) {
       String ans = s+s;
       String ans1 = ans.substring(1, ans.length()-1);
       return ans1.contains(s);
    }
}