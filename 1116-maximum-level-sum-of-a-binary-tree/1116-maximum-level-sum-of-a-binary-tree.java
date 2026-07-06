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
    public int maxLevelSum(TreeNode root) {
        if (root == null) {return 0;} // 0 level case
        int maxSum = Integer.MIN_VALUE,curLvl = 1, maxLvl = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root); 
        while (!q.isEmpty()) {
            int lvlLen = q.size(), curSum = 0;
            for (int i = 0; i < lvlLen; i++) {
                TreeNode node = q.poll();
                curSum += node.val;

                if (node.left != null) {q.offer(node.left);}
                if (node.right != null) {q.offer(node.right);}
            }
            if (curSum > maxSum) {
                maxSum = curSum;
                maxLvl = curLvl;
            }
            curLvl++;
        }
        return maxLvl;
    }
}