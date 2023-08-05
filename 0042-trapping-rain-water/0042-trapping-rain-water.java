class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        if (n <= 2) {
            return 0;
        }

        int trappedWater = 0;

        // Create two arrays to store the maximum height to the left and right of each position.
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Initialize the left and right max arrays.
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Calculate the trapped water at each position.
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return trappedWater;
    }
}
