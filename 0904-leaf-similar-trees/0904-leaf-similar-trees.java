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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        stack1.push(root1);
        stack2.push(root2);
        dfs(stack1,arr1);
        dfs(stack2,arr2);
        return arr1.equals(arr2);
    }
    private boolean isLeaf(TreeNode root) {
        if (root == null) {return false;}
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }
    private void dfs(Stack<TreeNode> stack, ArrayList<Integer> arr) {
        while (!stack.empty()) {
            TreeNode cur = stack.pop();
            if (isLeaf(cur)) {
                arr.add(cur.val);
            }
            if (cur.left != null) stack.push(cur.left);
            if (cur.right != null) stack.push(cur.right);
        }
    }
}