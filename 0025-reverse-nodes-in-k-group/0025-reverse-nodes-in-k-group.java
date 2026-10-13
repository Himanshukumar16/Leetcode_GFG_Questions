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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode kthnode = null;
        ListNode prev = null;

        while (temp != null) {

            kthnode = findKNode(temp, k);

            if (kthnode == null) {
                if (prev != null) prev.next = temp;
                break;
            }

            ListNode nextNode = kthnode.next;
            kthnode.next = null;
            reverse(temp);

            if (temp == head) head = kthnode;

            else {
                prev.next = kthnode;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }

    ListNode findKNode(ListNode temp, int k) {
        k -= 1;

        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }

        return temp;
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