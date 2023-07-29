/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int f(TreeNode root){
        if(root==null)return 0;
        int right = Math.max(0, f(root.left));
        int left = Math.max(0, f(root.right));
        max = Math.max(max , left+right+root.val);
        return Math.max(left, right)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        f(root);
        return max;
    }
}