class Solution {
    public boolean isFascinating(int n) {
        int ans = 2*n;
        int ans1 = 3*n;
        String str = Integer.toString(ans);
        String str1 = Integer.toString(ans1);
        String str2 = Integer.toString(n);
        String res = str2+str1+str;
        String res1 = "123456789";
        char ch[] = res.toCharArray();
        Arrays.sort(ch);

        String k = String.valueOf(ch);
        if(k.length()!=9)return false;
        if(res1.equals(k))return true;
        else 
        return false;
    }
}