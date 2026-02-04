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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();  //dummy to hold LL
        ListNode node = ans; 
        // temp holders
        ListNode one = list1;
        ListNode two = list2;
        while (one != null && two != null) {
            if (one.val < two.val) {
                node.next = one;
                one = one.next;
            } else {
                node.next = two;
                two = two.next;
            }
            //advance node
            node = node.next;
        }
        //now add the rest, only needs 1 add for the final connection
        if (one != null) {
            node.next = one;
        } else {
            node.next = two;
        }
        return ans.next;
    }
}