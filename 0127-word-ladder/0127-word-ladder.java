import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                if (currentWord.equals(endWord)) return level;
                char[] charArray = currentWord.toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    char originalChar = charArray[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c != originalChar) {
                            charArray[j] = c;
                            String transformedWord = new String(charArray);
                            if (wordSet.contains(transformedWord)) {
                                queue.offer(transformedWord);
                                wordSet.remove(transformedWord);
                            }
                        }
                    }
                    charArray[j] = originalChar;
                }
            }
            level++;
        }
        return 0;
    }
}
