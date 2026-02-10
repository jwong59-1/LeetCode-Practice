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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //idea:
        //slow and fast pointer, and give fast pointer n-steps head start
        //slow and fast then move at the same pace
        // when fast reaches the tail (null), slow should be at the nth from the back
        ListNode slow = new ListNode(0,head); //edge case, if we remove the only node from LL.
        ListNode fast = head;
        ListNode dummy = slow; //stores our original LL
        //give fast a head start
       for (int i = 0; i < n; i++) {
        fast = fast.next;
       }
        //now we can move slow and fast
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // we now have slow as the n-1th node
        //remove node
        slow.next = slow.next.next;
        return dummy.next; //This avoids the 0 we put in front
    }
}