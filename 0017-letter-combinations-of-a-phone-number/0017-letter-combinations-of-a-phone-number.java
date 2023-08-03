class Solution {
     public static List<String> combine(String digit, List<String> l){
      List<String> res1 = new ArrayList<>();
        for(int i=0; i<digit.length(); i++){
            for(String x:l){
                res1.add(x+digit.charAt(i));
            }
        }
        return res1;
    }
    public List<String> letterCombinations(String digits) {
      
       String ans[] = {"", "", "abc", "def", "ghi","jkl","mno", "pqrs","tuv", "wxyz"};
       List<String> res = new ArrayList<>();
       if(digits.length()==0)return res;
       res.add("");
       for(int i=0; i<digits.length(); i++){
           res = combine(ans[digits.charAt(i)-'0'], res);
         
       }  
         return res;
    }
     

}