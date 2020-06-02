package solutions;

public class Day02_DeleteNodeInLinkedList {

	// Clone the next node to current node i.e in a way deleting the current node we are at
	public void deleteNode(ListNode node) {
		// Set current node's value to the value of next node
		node.val = node.next.val;
		
		// Skip node.next as we have already cloned it
		node.next = node.next.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}