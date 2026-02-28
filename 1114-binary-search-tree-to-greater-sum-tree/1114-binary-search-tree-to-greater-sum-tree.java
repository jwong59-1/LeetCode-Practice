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
    int count = 0;
    public TreeNode bstToGst(TreeNode root) {
        //rev? inorder will give all vals greater than val @ node
        //instance of our running sum
        
        return revIn(root);
        //helper recurv funct
        //we keep track of the total sum to add, always add right  
    
    }
    public TreeNode revIn(TreeNode root) {
            //base case
            if(root == null) return root;
            //
            revIn(root.right);
            //sum of all greater
            count += root.val;
            //set add as val
            root.val = count;
            revIn(root.left);

            return root;
        }

}