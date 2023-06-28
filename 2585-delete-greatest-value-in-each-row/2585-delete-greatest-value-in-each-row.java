class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int [] i: grid){
            Arrays.sort(i);
        }
        int count =0;
        for(int j=0; j<grid[0].length; j++){
            int maxi =0;
            for(int i=0; i<grid.length; i++){
                maxi = Math.max(maxi, grid[i][j]);
            }
            count+=maxi;
        }
        return count;
    }
}