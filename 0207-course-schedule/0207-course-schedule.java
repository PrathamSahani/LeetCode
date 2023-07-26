class Solution {
    public boolean canFinish(int n, int[][] p) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i=0; i<n; i++){
             adj.add(new ArrayList<>());
         }
         for(int i=0; i<p.length; i++){
             adj.get(p[i][1]).add(p[i][0]);
         }
         int ans[] = new int[n];
         for(int i=0; i<n; i++){
             for(int it: adj.get(i)){
                 ans[it]++;
             }
         }
         Queue<Integer> q = new LinkedList<>();
         for(int i=0; i<n; i++){
             if(ans[i]==0)q.add(i);
         }
         ArrayList<Integer> list = new ArrayList<>();
         while(!q.isEmpty()){
             int node = q.peek();
             q.remove();
             list.add(node);
             for(int it: adj.get(node)){
                 ans[it]--;
                 if(ans[it]==0)q.add(it);
             }
         }
         if(list.size()==n)return true;
         return false;
    }
}