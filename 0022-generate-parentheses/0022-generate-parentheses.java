class Solution {
    void findall(String cur, int o, int c, List<String> res, int n){
        if(cur.length()==2*n){
            res.add(cur);
        }
        if(o<n)findall(cur+"(", o+1, c, res, n);
        if(c<o)findall(cur+")" , o, c+1, res, n);
        
    }
    
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        findall("(" , 1, 0, res, n);
        return res;
    }
 
}
