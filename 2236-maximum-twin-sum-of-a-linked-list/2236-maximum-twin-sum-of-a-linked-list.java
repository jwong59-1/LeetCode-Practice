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
    public int pairSum(ListNode head) {
        //part 1: find the middle
        ListNode mid = head;
        ListNode fast = head.next.next;
        ListNode first = head;

        while (fast != null && fast.next != null) {
            mid = mid.next;
            fast = fast.next.next;
        }
        //reverse LL
        ListNode prev = null;
        while (mid != null) {
            ListNode temp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = temp;
        }
        int sum = 0;  //Can also set to min_val, but min val for node = 1
        while (first != null && prev != null) {
            int cur = first.val+prev.val;
            sum = Math.max(cur,sum);
            prev = prev.next;
            first = first.next;
        }
        return sum;
    }
}