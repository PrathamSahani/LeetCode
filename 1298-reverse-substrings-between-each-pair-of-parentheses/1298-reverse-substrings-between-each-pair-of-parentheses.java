class Solution {
    public static void reverse(StringBuilder sb, int i, int j){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
            }
        }
    
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        int start;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
            st.push(i);
            }
            else if(s.charAt(i)==')'){
            start =st.pop();
            reverse(sb, start, i);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c: sb.toString().toCharArray()){
            if(c!='(' && c!=')'){
                res.append(c);
            }
        }
        return res.toString();
        
    }
}