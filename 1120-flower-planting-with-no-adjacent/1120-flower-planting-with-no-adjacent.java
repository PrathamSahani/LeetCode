class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<List<Integer>> adj = new ArrayList<>();
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(var p:paths){
            adj.get(p[0]-1).add(p[1]-1);
            adj.get(p[1]-1).add(p[0]-1);
        }
        for(int i=0; i<n; i++){
            boolean color[] = new boolean[5];
            for(var c: adj.get(i)){
                color[ans[c]] = true;
            }
            for(int j=1; j<=4; j++){
                if(!color[j]){
                    ans[i] = j;break;
                }
            }
        }
        return ans;
   
    }
}