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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (t1 != null && t2 != null) {
            temp.next = new ListNode((t1.val + t2.val + carry) % 10);
            carry = (t1.val + t2.val + carry) / 10;
            temp = temp.next;
            t1 = t1.next;
            t2 = t2.next;
        }

        while (t1 != null) {
            temp.next = new ListNode((t1.val + carry) % 10);
            carry = (t1.val + carry) / 10;
            temp = temp.next;
            t1 = t1.next;
        }

        while (t2 != null) {
            temp.next = new ListNode((t2.val + carry) % 10);
            carry = (t2.val + carry) / 10;
            temp = temp.next;
            t2 = t2.next;
        }

        if (carry == 1) temp.next = new ListNode(1);
        return dummy.next;
    }
}