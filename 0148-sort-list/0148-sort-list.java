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
    public ListNode sortList(ListNode head) {
        return split(head);
    }

    ListNode findMiddle(ListNode temp) {
        ListNode fast = temp.next;
        ListNode slow = temp;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    ListNode split(ListNode temp) {
        if (temp == null || temp.next == null) return temp;

        ListNode mid = findMiddle(temp);
        ListNode leftHead = temp;
        ListNode rightHead = mid.next;
        mid.next = null;

        leftHead = split(leftHead);
        rightHead = split(rightHead);

        return merge(leftHead, rightHead);
    }

    ListNode merge(ListNode leftHead, ListNode rightHead) {
        ListNode dummy = new ListNode(-1);
        ListNode tempLeft = leftHead;
        ListNode tempRight = rightHead;
        ListNode temp = dummy;

        while (tempLeft != null && tempRight != null) {
            if (tempLeft.val < tempRight.val) {
                temp.next = tempLeft;
                temp = tempLeft;
                tempLeft = tempLeft.next;
            } else {
                temp.next = tempRight;
                temp = tempRight;
                tempRight = tempRight.next;
            }
        }
        if (tempLeft != null) {
            temp.next = tempLeft;
        } else temp.next = tempRight;

        return dummy.next;
    }
}