class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        for(int node=0; node<n; node++){
            if(color[node]==0){
                Queue<Integer> q = new LinkedList<>();
                q.add(node);
                color[node]=1;
                while(!q.isEmpty()){
                    int curr = q.poll();
                    for(int it: graph[curr]){
                        if(color[it]==0){
                            color[it]=-color[curr];
                            q.add(it);
                        }else if(color[it]==color[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}