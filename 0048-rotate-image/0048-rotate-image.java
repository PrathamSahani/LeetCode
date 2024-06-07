class Solution {
    public void rotate(int[][] matrix) {
          int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            int left =0, right = matrix.length-1;
            while(left<=right){
                int temp = matrix[i][right];
                matrix[i][right] = matrix[i][left];
                matrix[i][left] = temp;
                left++;right--;
            }
        }
    }
}