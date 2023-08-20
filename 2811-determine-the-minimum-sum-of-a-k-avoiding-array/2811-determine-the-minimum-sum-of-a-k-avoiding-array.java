class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0;
        List<Integer> vec = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            if (vec.contains(k - i)) {
                n++;
            } else {
                sum += i;
                vec.add(i);
                // System.out.print(i + " ");
            }
            i++;
        }
        return sum;
        
    }
}