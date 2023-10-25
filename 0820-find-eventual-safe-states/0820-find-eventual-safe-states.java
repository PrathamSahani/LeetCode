class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = graph.length;
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            for(int it: graph[i]){
                adj.get(it).add(i);
                ans[i]++;
            }   
        }
         Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(ans[i]==0){
                q.add(i);
            }
        }
       
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            list.add(node);
            for(int it: adj.get(node)){
                ans[it]--;
                if(ans[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}