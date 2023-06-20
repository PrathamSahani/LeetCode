class Solution {
    public void rotate(int[][] matrix) {
            //Transpose
       for(int i=0; i<matrix.length; i++){
           for(int j=i; j<matrix[0].length; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
       for(int i=0; i<matrix.length; i++){
         
               int right = 0, left = matrix.length-1;
               while(right<=left){
                   int temp = matrix[i][right];
                   matrix[i][right] = matrix[i][left];
                   matrix[i][left] = temp;
                   left--; right++;
               }
           
       }
    }
}