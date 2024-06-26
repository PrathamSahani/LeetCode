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
    public void Inorder(ArrayList<Integer> list, TreeNode root){
          if(root==null) return ;
          Inorder(list, root.left);
          list.add(root.val);
          Inorder(list, root.right);
    }
    public TreeNode f(ArrayList<Integer> list, int s, int e){
        if(s>e){
            return null;
        }
        int mid = (s+e)/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = f(list, s, mid-1);
        root.right = f(list, mid+1, e);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)return root;
        Inorder(list, root);
        return f(list, 0, list.size()-1);
    }
}















