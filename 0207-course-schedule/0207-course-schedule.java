class Solution {
    public boolean canFinish(int n, int[][] p) {
 ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
           for(int i=0; i<n;i++) {
               adj.add(new ArrayList<>());
           }
           int ans[] = new int[n];
           for(int edge[]: p){
               adj.get(edge[0]).add(edge[1]);
               ans[edge[1]]++;
           }
           Queue<Integer> q = new LinkedList<>();
           for(int i=0; i<n; i++){
               if(ans[i]==0){
                   q.add(i);
               }
           }
           ArrayList<Integer> res = new ArrayList<>();
           while(!q.isEmpty()){
               int node = q.peek();
               q.remove();
               res.add(node);
               for(int it: adj.get(node)){
                   ans[it]--;
                   if(ans[it]==0)q.add(it);
               }
           }
            if(res.size()==n)return true;
           return false;
        
       
    }
}