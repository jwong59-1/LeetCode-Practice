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
    public ListNode reverseList(ListNode head) {
        //keep track of the current link list node 
        ListNode curr = head;
        //track the previous node after reversing the LL pointer
        ListNode prev = null;
        //iterate through the linked list
        while (curr != null) {
            /*
            store the next node (for the reverse operation)
            Note: need temporarily store the next node, as reversing 
            the pointer breaks off the connection from the curr node to
            the next node.
            */
            ListNode temp = curr.next;
            //Set the curr nodes's next pointer as the previous node
            curr.next = prev;
            //for next iteration:
            //set the prev node as the curr node
            prev = curr;
            //set curr as the next node
            curr = temp;
        }
        return prev; //we return the start of the reversed linked list
    }
}