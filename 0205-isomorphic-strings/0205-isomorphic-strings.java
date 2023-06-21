class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        HashMap<Character, Character> map = new HashMap<>();
        if(s1.length()!=s2.length())return false;
        for(int i=0; i<s1.length(); i++){
            char p1 = s1.charAt(i);
            char p2 = s2.charAt(i);
            if(map.containsKey(p1)){
                if(map.get(p1)!=p2){
                    return false;
                }

            }
            else if(map.containsValue(p2)){
                return false;
            }else{
                map.put(p1, p2);
            }
        }
        return true;
     
    }
}