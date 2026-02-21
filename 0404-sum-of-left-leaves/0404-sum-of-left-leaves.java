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
    public int sumOfLeftLeaves(TreeNode root) {
        //base case
        return leftLeaves(root,false);
    }
    public int leftLeaves(TreeNode root,boolean isLeft) {
        //base case
        if (root == null) {
            return 0;
        }
        //if leaf, check left
        if (root.left == null && root.right == null) {
            if (isLeft) {
                return root.val;
            } else {
                return 0;
            }
        }
        return leftLeaves(root.left,true) + leftLeaves(root.right,false);
    }
}