# Reverse Alternate K in Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **head**  of a linked list and an integer  **k**, reverse every alternate group of k nodes, starting with the first group.

If the number of nodes left at the end of the list is fewer than k, reverse these remaining nodes or leave them in their original order, depending on the alternation pattern.

 **Examples:** 

```
Input: head = 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL, k = 2
Output: 2 -> 1 -> 3 -> 4 -> 6 -> 5 -> NULL
Explanation: 

The nodes that are reversed are highlighted in green in the figure.
```

```
Input: head = 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> NULL, k = 3
Output: 3 -> 2 -> 1 -> 4 -> 5 -> 6 -> 8 -> 7-> NULL
Explanation: 

The nodes that are reversed are highlighted in green in the figure.
```

 **Constraints:** 
1 ≤ number of nodes, node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T05:01:39.636Z  

```java
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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/xor-linked-list/1)