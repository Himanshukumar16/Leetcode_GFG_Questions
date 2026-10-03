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
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        int carry = recur(temp, 0);
        if (carry == 1) {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }
    int recur (ListNode head, int carry) {

        // base case
        if (head.next == null) {
            int data = head.val;
            head.val = (data + data) % 10;
            carry = (data + data) / 10;
            return carry;
        }

        // func call
        carry = recur (head.next, carry);

        // if there is a carry
        int data = head.val;
        head.val = ((data * 2) + carry) % 10;
        carry = ((data * 2) + carry) / 10;

        // return ans
        return carry;
    }
}