import java.util.LinkedList;

class Solution {
    public void fullStack(LinkedList<Character> stack, String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '#')
            {
                if(stack.size() > 0) stack.removeLast();
            }
            else
                stack.add(str.charAt(i));
        }
    }
    public boolean backspaceCompare(String s, String t) {
        LinkedList<Character> stackS = new LinkedList<>();
        LinkedList<Character> stackT = new LinkedList<>();
        fullStack(stackS, s);
        fullStack(stackT, t);
        while (stackS.size() > 0 && stackT.size() > 0)
        {
            if (stackS.getFirst() != stackT.getFirst())
                return false;
            stackS.removeFirst();
            stackT.removeFirst();
        }
        if (stackS.size() > 0 || stackT.size() > 0)
            return false;
        return true;
    }
}