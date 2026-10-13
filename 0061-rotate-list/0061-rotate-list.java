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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int len = findLength(head);

        ListNode temp = head;
        ListNode lastNode = null;
        int cutoff = k % len;

        while (temp.next != null) {
            temp = temp.next;
        }

        lastNode = temp;
        lastNode.next = head;
        int cnt = 0;
        temp = head;

        while (temp != null) {
            cnt++;

            if (cnt == len - cutoff) {
                head = temp.next;
                temp.next = null;
                break;
            }

            temp = temp.next;
        }

        return head;
    }

    int findLength(ListNode head) {
        int cnt = 0;

        while (head != null) {
            cnt++;
            head = head.next;
        }

        return cnt;
    }
}