class Solution {
    public int findCenter(int[][] edges) {
          HashSet<Integer> grid = new HashSet<>();
          for(int []edge:edges){
            if(grid.contains(edge[0])){
                return edge[0];
            }
            grid.add(edge[0]);
            if(grid.contains(edge[1])){
                return edge[1];
            }
            grid.add(edge[1]);
          }
          return -1;
    }
}