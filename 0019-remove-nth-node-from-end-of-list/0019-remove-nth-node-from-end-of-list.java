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
        ListNode temp = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        int removeNode = cnt - n + 1;

        temp = head;
        cnt = 0;

        if (removeNode == 1) return head.next;

        while (temp != null) {
            cnt++;
            if (cnt == removeNode - 1) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

        return head;
    }
}