class Solution {
    public int[] findOrder(int n, int[][] p) {
        int topo[] = new int[n];
        int indegree[] = new int[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<p.length; i++){
            adj.get(p[i][1]).add(p[i][0]);
        }
        for(int i=0; i<n; i++){
            for(Integer it: adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int i=0;
        while(!q.isEmpty()){
            Integer curr = q.poll();
            topo[i++]=  curr;
            for(Integer it: adj.get(curr)){
                indegree[it]--;
                if(indegree[it]==0)
                q.add(it);
            }
        }
        if(i==n)return topo;
        int[] arr = {};
        return arr;
        
    }
}