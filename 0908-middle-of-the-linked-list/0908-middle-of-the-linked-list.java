/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        /* approach: 
        use a fast and slow pointer
        fast pointer traverses twice as fast (.next.next)
        iterate through 2 instances of LL.
        when fast pointer reaches in the end, slow pointer reaches the middle
        */ 
        ListNode fast = head;
        ListNode slow = head;
        //check each fast node while skipping 1 node
        while (fast !=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow; //When we reach the end of the node, slow should be at the middle
    }
}