class Pair{
    String str;
    int first;
    Pair(String str, int first){
        this.str = str;
        this.first = first;
    }
}
class Solution {
    public int ladderLength(String s, String e, List<String> w) {
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(s, 1));
            HashSet<String> set = new HashSet<>(w);
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
                         if(ch==word.charAt(i))
                         continue;
                         char  replace[] = word.toCharArray();
                         replace[i] = ch;
                         String rep = new String(replace);
                         if(set.contains(rep)){
                             set.remove(rep);
                             q.add(new Pair(rep, step+1));
                         }
                    }
                }
            
            }
            return 0;
    }
}