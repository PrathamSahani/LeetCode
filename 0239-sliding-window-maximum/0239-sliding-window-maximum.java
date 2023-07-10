class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int res[] = new int[nums.length-k+1];
        int ans = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<nums.length; i++){
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            q.add(i);
            if(i>=k-1){
                res[ans++] = nums[q.peek()];
            }


        }
        return res;
      }
}