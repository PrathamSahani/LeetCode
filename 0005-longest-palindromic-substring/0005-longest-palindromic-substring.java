
 class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        String longestPalindrome = "";
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < s.length() - i + 1; j++) {
                String st = s.substring(j, j + i);
                if (isPalindrome(st)) {
                    return st;
                }
            }
        }
        return longestPalindrome;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}