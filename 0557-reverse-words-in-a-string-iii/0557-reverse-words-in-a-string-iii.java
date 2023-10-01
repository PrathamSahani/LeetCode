class Solution {
    public String reverseWords(String S) {
         String str[] = S.split(" ");
         for(int i=0; i<str.length; i++){
             str[i] = new StringBuilder(str[i]).reverse()
.toString();
         }
         return String.join(" ", str);
    }
}