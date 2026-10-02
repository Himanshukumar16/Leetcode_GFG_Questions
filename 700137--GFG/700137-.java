/* Structure of Doubly Linked List Node
class Node {
	int data;
	Node next;
	Node prev;
	
	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
*/
class Solution {
	public Node reverse(Node head) {
		// code here
		Node temp = head;
		Node pre = temp.prev;
		
		while (temp != null) {
			Node dummy = temp.next;
			temp.prev = temp.next;
			temp.next = pre;
			pre = temp;
			temp = dummy;
		}
		
		return pre;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna