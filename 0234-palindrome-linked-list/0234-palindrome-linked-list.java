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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;

        if (head == null || head.next == null) return true;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse (slow.next);

        while (secondHalf != null) {
            if (temp.val != secondHalf.val) return false;
            temp = temp.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }
    ListNode reverse(ListNode temp) {
        ListNode prev = null;

        while (temp != null) {
            ListNode dummy = temp.next;
            temp.next = prev;
            prev = temp;
            temp = dummy;
        }

        return prev;
    }
}