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
    public ListNode oddEvenList(ListNode head) {
        ListNode headOdd = new ListNode();
        ListNode headEven = new ListNode();
        ListNode temp = head;
        ListNode tempOdd = headOdd;
        ListNode tempEven = headEven;
        int cnt = 0;

        while (temp != null) {
            cnt += 1;
            if(cnt % 2 == 0) {
                tempEven.next = new ListNode(temp.val);
                tempEven = tempEven.next;
            } else {
                tempOdd.next = new ListNode(temp.val);
                tempOdd = tempOdd.next;
            }
            temp = temp.next;
        }
        tempOdd.next = headEven.next;
        return headOdd.next;
    }
}