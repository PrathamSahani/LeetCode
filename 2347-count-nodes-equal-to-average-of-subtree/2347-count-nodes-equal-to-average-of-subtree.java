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
    private int count =0;
    private int[] Post(TreeNode root){
        if(root==null)return new int[]{0, 0};
        int[] left = Post(root.left);
        int[] right = Post(root.right);
        int totalS = left[0]+right[0]+root.val;
        int totalN = left[1]+right[1]+1;
        if(totalS/totalN==root.val){
            count++;
        }
        return new int[]{totalS, totalN};
    }
    public int averageOfSubtree(TreeNode root) {
           if(root==null)return count;
            Post(root);
            return count;
    }
}





