class Solution {
    public boolean canFinish(int n, int[][] p) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i=0; i<n; i++){
             adj.add(new ArrayList<>());
         }
         for(int i=0; i<p.length; i++){
             adj.get(p[i][1]).add(p[i][0]);
         }
         int ans[]  = new int[n];
         for(int i=0; i<n; i++){
             for(int it: adj.get(i)){
                 ans[it]++;
             }
         }
         Queue<Integer> q = new LinkedList<>();
         for(int i=0; i<n; i++){
             if(ans[i]==0){
                q.add(i);
             }
         }
         int count =0;
         while(!q.isEmpty()){
             int node = q.peek();
             count++;
             q.remove();
             for(int it: adj.get(node)){
                 ans[it]--;
                 if(ans[it]==0){
                     q.add(it);
                 }
             }

         } 
         if(count==n)return true;
         return false;
    }
}