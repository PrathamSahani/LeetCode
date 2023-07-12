class Solution {
    public static void dfs(int j  , int grid[][], boolean[]vis){
        vis[j] = true;
        for(int i=0; i<grid[0].length; i++){
            if(vis[i]==false && grid[j][i]==1){
                dfs(i, grid, vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int c =0;
        boolean vis[] = new boolean[isConnected.length];
        for(int i=0; i<isConnected[0].length; i++){
            if(vis[i]==false){
                dfs(i, isConnected, vis);
                c++;
            }
        }
        return c;
    }
}