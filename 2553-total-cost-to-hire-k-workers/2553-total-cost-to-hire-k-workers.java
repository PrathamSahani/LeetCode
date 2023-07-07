class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ans=0;
        int n=costs.length;
        PriorityQueue<Integer>pq1=new PriorityQueue<>();
        PriorityQueue<Integer>pq2=new PriorityQueue<>();
        int i=0;
        int front=0,back=n-1;
        while(i<k){
            while(front<candidates){
                pq1.add(costs[front]);
                front++;
            }
            while(back>=front && back>=n-candidates){
                pq2.add(costs[back]);
                back--;
            }
            if(pq2.isEmpty() || !pq1.isEmpty() &&pq1.peek()<=pq2.peek()){
                //System.out.println(pq1.peek());
                ans+=pq1.poll();
                if(front<=back)
                    pq1.add(costs[front++]);
            }else if(pq1.isEmpty() ||!pq2.isEmpty() && pq1.peek()>pq2.peek()){
               // System.out.println(pq2.peek());
                ans+=pq2.poll();
                if(front<=back){
                    pq2.add(costs[back--]);
                }
            }
          i++;
        }
        return ans;
    }
}