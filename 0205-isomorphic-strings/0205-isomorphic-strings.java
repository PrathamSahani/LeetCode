class Solution {
    public boolean isIsomorphic(String str1, String str2) {
        HashMap<Character, Character> map = new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0; i<str1.length(); i++){
            if(map.containsKey(str1.charAt(i))){
                if(map.get(str1.charAt(i))!=str2.charAt(i)){
                    return false;
                }
            }
            else if(map.containsValue(str2.charAt(i))){
                return false;
            }else{
                map.put(str1.charAt(i), str2.charAt(i));
            }
        }
        return true;
    }
}