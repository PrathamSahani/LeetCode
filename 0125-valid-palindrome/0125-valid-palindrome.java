class Solution {
    public boolean isPalindrome(String s) {
     s= s.toLowerCase().replaceAll("[^a-z0-9]", "");
     String p = new StringBuilder(s).reverse().toString();
     if(s.equals(p))return true;
     else return false;
   
       
    }
}