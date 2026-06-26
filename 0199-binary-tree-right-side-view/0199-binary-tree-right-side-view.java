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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) {
            q.offer(root);
        }
        while (!q.isEmpty()) {
            TreeNode curr = null;
            int qsize = q.size(); //track number of nodes per depth
            for (int i = 0; i < qsize; i++) {
                TreeNode node = q.poll();
                if (node != null) {
                    curr = node;
                    if (node.left != null) { q.offer(node.left);}
                    if (node.right != null) {q.offer(node.right);}
                } 
            }
             if (curr != null) {
                    ans.add(curr.val);
            }
        }
        return ans;
    }
}