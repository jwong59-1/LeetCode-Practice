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
    public int goodNodes(TreeNode root) {
        return dfs(root,Integer.MIN_VALUE);
    }
    private int dfs(TreeNode node,int max_num) {
        if (node == null) {
            return 0;
        }
        int val = 0;
        if (node.val >= max_num) {
            val += 1;
            max_num = node.val;
        }
        return val + dfs(node.left,max_num) + dfs(node.right,max_num);
    }
}