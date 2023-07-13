class Solution {
    public static void fill(int image[][], int row, int col, int prev, int Color){
        if(row<0 || row>=image.length || col<0 || col>=image[0].length){
            return ;
        }
        if(image[row][col]==Color)return ;
        if(image[row][col]!=prev)return ;
        if(image[row][col]==prev)
        image[row][col] = Color;
        fill(image, row-1, col, prev, Color);
        fill(image, row, col+1, prev, Color);
        fill(image, row+1, col , prev, Color);
        fill(image, row, col-1, prev, Color);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int arr[][] = image;
        int prev = image[sr][sc];
        fill(arr, sr, sc, prev, color );
        return arr;
    }
}