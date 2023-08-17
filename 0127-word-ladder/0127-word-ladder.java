
class Pair{
    String str;
    int first;
    Pair(String str, int first){
        this.first = first;
        this.str = str;
    }
}
class Solution {
    public int ladderLength(String s, String e, List<String> w) {
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(s, 1));
        Set<String> set = new HashSet<>(w);
        set.remove(s);
        while(!q.isEmpty()){
            Pair it = q.poll();
            String word = it.str;
            int step = it.first;
            if(word.equals(e)){
                return step;
            }
            for(int i=0; i<word.length(); i++){
                for(char ch='a'; ch<='z'; ch++){
                char replace[] = word.toCharArray();
                replace[i] = ch;
                String ans = new String(replace);
                if(set.contains(ans)){
                    set.remove(ans);
                    q.add(new Pair(ans, step+1));
                }
                }
            }
        }
        return 0;
    }
}