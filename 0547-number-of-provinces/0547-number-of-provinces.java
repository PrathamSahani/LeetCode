class Solution {
    public void dfs(int j, int[][] grid, boolean visited[]){
        visited[j] = true;
        for(int i=0; i<grid[j].length; i++){
            if(visited[i]==false && grid[j][i]==1){
                dfs(i, grid, visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean visited[]= new boolean[isConnected.length];
        int c=0;
        for(int i=0; i<isConnected.length; i++){
            if(visited[i]==false){
                dfs(i, isConnected, visited);
                c++;
            }
        }return c;
    }
}