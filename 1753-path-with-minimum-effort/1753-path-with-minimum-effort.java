class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        minHeap.offer(new int[]{0, 0, 0});  // Format: {row, col, difference}
        
        int[][] minEffort = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(minEffort[i], Integer.MAX_VALUE);
        }
        minEffort[0][0] = 0;
        
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int row = current[0];
            int col = current[1];
            int diff = current[2];
            
            if (row == rows - 1 && col == cols - 1) {
                return diff;
            }
            
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    int newDiff = Math.max(diff, Math.abs(heights[newRow][newCol] - heights[row][col]));
                    
                    if (newDiff < minEffort[newRow][newCol]) {
                        minEffort[newRow][newCol] = newDiff;
                        minHeap.offer(new int[]{newRow, newCol, newDiff});
                    }
                }
            }
        }
        
        return -1;  // This line won't be reached if a path exists from (0, 0) to (rows-1, cols-1).
    }
}
