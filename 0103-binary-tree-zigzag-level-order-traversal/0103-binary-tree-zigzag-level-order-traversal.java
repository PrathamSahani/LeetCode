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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> list = new ArrayList<>();
         if(root==null)return list;
         Queue<TreeNode> q = new LinkedList<>();
         q.add(root);
         int level =1;
         while(!q.isEmpty()){
             int n = q.size();
             List<Integer> res = new ArrayList<>();
             for(int i=0; i<n; i++){
                 TreeNode temp = q.poll();
                 res.add(temp.val);
                 if(temp.left!=null){
                     q.add(temp.left);
                 }
                 if(temp.right!=null){
                     q.add(temp.right);
                 }
             }if(level%2==0){
                 Collections.reverse(res);
             }
             list.add(res);
             level++;

         }
         return list; 
    }
}


















