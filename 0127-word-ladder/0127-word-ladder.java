class Pair{ 
  String first;
  int second;
   Pair(String first, int second){
    this.first = first;
    this.second = second;
  }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
           Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord, 1));
        HashSet<String> set = new HashSet<>();
        int len = wordList.size();
        for(int i=0; i<len; i++){
            set.add(wordList.get(i));
        }
        set.remove(beginWord);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();
            if(word.equals(endWord)==true){
                return steps;
            }
            for(int i=0; i<word.length(); i++){
                for(char ch='a'; ch<='z'; ch++){
                    char replace[] = word.toCharArray();
                    replace[i] = ch;
                    String replaceWord = new String(replace);
                    if(set.contains(replaceWord)){
                        set.remove(replaceWord);
                        q.add(new Pair(replaceWord , steps+1));
                    }
                }
            }
            
        }
        return 0;
    }
}