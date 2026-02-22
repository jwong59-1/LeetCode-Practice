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
    public boolean isSymmetric(TreeNode root) {
        return mirroring(root.left,root.right);
    
    }
    public boolean mirroring(TreeNode left,TreeNode right) {
        //base case:
        //even mirroring
        if (left == null && right == null) {
            return true;
        }
        //check for uneven mirror
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && mirroring(left.left,right.right) && mirroring(left.right,right.left);
    }   
}