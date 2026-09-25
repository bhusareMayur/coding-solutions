/* Linked List Node Structure
class Node {
	int data;
	Node next;
	
	Node(int val) {
		data = val;
		next = null;
	}
} */

class Solution {
	public Node kAltReverse(Node head, int k) {
		// code here
		Node temp = head;
		Node tail = head;
		Node curr = head;
		Node prev = null;
		
		while (temp != null) {
			int i = k;
			curr = temp;
			tail = temp;
			// prev = tail;
			// 			Node check = temp;
			// 			boolean canReverse = true;
			// 			for (int c = 1; c < k; c++) {
			// 				if (check == null || check.next == null) {
			// 					canReverse = false;
			// 					break;
			// 				}
			// 				check = check.next;
			// 			}
			while (i > 1 && tail != null) {
				if (tail.next == null) {
					break;
					// 	return head;
				}
				// prev = tail;
				tail = tail.next;
				
				i--;
			}
			if (tail != null) {
				temp = tail.next;
				reverse(curr, tail);
				if (curr == head) {// first reverse
					head = tail;
				} else {
					prev.next = tail;
				}
				curr.next = temp;
				prev = curr;
			} else {
				// temp = tail
				if (prev != null) {
					prev.next = temp;
				}
				break;
			}
			i = k;
			while (i > 0 && temp != null) {
				prev = temp;
				temp = temp.next;
				i--;
			}
			
		}
		return head;
		
	}
	public void reverse(Node s, Node e) {
		Node prev = null;
		Node current = s;
		Node nextNode = null;
		
		Node stopNode = e.next;
		
		while (current != stopNode) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
	}
	
}
