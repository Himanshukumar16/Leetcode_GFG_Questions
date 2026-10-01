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
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int sum = carry;
            sum += l1.val;
            sum += l2.val;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            temp.next = new ListNode(sum);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        temp = dummy.next;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (l1 != null) {
            if (l1.val + carry >= 10) {
                l1.val = (l1.val + carry ) % 10;
                temp.next = new ListNode(l1.val);
                carry = 1;
            } else {
                temp.next = new ListNode(l1.val + carry);
                carry = 0;
            }
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            if (l2.val + carry >= 10) {
                l2.val = (l2.val + carry ) % 10;
                temp.next = new ListNode(l2.val);
                carry = 1;
            } else {
                temp.next = new ListNode(l2.val + carry);
                carry = 0;
            }
            temp = temp.next;
            l2 = l2.next;
        }

        if (carry == 1) {
            temp.next = new ListNode(1);
        }

        return dummy.next;
    }
}