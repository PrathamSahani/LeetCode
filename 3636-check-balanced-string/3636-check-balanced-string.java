class Solution {
    public boolean isBalanced(String num) {
         int even = 0;
         int odd = 0;

         for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);

            if(i%2==0){
                even+=Character.getNumericValue(ch);
            }
            else{
                odd+=Character.getNumericValue(ch);
            }
         }
         return even==odd;

    }
}