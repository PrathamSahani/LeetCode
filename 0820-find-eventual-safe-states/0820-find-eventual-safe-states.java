class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
         List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        int indgree[] = new int[V];
        for(int i=0; i<V; i++){
            for(int it: graph[i]){
                adj.get(it).add(i);
                indgree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> safe = new ArrayList<>();
        for( int i=0; i<V; i++){
            if(indgree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            safe.add(node);
            for(int it:adj.get(node)){
                indgree[it]--;
                if(indgree[it]==0)q.add(it);
            }
        }
        Collections.sort(safe);
        return safe;
    }
}