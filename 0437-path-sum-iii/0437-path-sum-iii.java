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
    int coutn =0;
    public void solve(TreeNode root, int target, long temp, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        solve(root.left, target, temp, list);
        solve(root.right, target, temp, list);
        for(int i=list.size()-1; i>=0; i--){
            temp+=list.get(i);
            if(temp==target){
                coutn++;
            }
        }
        list.remove(list.size()-1);
    }
    public int pathSum(TreeNode root, int targetSum) {
        coutn=0;
        ArrayList<Integer> list = new ArrayList<>();
        solve(root, targetSum, 0, list);
        return coutn;
    }
}



















