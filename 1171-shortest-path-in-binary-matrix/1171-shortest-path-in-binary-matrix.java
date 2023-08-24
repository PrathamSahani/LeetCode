class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
          int n = grid.length;
          if(grid[0][0] ==1 || grid[n-1][n-1]==1){
              return -1;
          }
          int delr[] = {-1, -1, -1, 0, 0, 1, 1,1};
          int delc[] = {-1, 0, 1, -1, 1, -1, 0, 1};
          Queue<int[]> q = new LinkedList<>();
          q.add(new int[]{0, 0, 1});
          grid[0][0] =1;
          while(!q.isEmpty()){
              int curr[] = q.poll();
              int row = curr[0];
              int col= curr[1];
              int step = curr[2];
              if(row==n-1 && col==n-1){
                  return step;
              }
              for(int i=0; i<8; i++){
                  int nrow = row+delr[i];
                  int ncol = col+delc[i];
                  if(ncol>=0 && nrow>=0 && ncol<grid[0].length && nrow<grid.length && grid[nrow][ncol]==0)
                  {
                      grid[nrow][ncol] = 1;
                      q.add(new int[]{nrow, ncol, step+1});
                  }
              }
          }
          return -1;
    }
}