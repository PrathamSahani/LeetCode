class Solution {
    public boolean canFinish(int n, int[][] p) {
       
       ArrayList<Integer> topo = new ArrayList<>();
        int indegree[] = new int[n];
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<p.length; i++){
            adj.get(p[i][1]).add(p[i][0]);
        }
        for(int i=0; i<n; i++){
            for(Integer it: adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
      
        while(!q.isEmpty()) {
            Integer curr = q.poll();
              topo.add(curr);
            for(Integer i: adj.get(curr)) {
                indegree[i]--;
                if(indegree[i] == 0)
                    q.add(i); 
            }
        }
        if(topo.size()==n)
            return true;
        return false;
    }
}