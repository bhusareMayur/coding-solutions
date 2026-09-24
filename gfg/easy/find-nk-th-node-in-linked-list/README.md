# Find n/k th in Linked list

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a singly linked list and an integer  **k**, find the (n/k)th node in the linked list, where n is the total number of nodes.If the value of n/k is not an integer, then consider its ceiling value.

 **Examples:** 

```
Input: head: 1->2->3->4->5->6, k = 2
Output: 3
Explanation: 6/2th element is the 3rd(1-based indexing) element which is 3.

```

```
Input: head: 2->7->9->3->5, k = 3
Output: 7
Explanation: The 5/3rd element is the 2nd element as mentioned in the question that we need to consider ceil value in the case of decimals. So 2nd element is 7.

```

 **Constraints:** 
1 <= number of nodes <= 104
1 <= k <= number of nodes
1 ≤ node->data ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T06:20:24.453Z  

```java
/* Structure of a linked list node
class Node
{
	int data;
	Node next;
	
	Node(int key)
	{
		data = key;
		next = null;
	}
} */

class Solution {
	public static int fractionalNode(Node head, int k) {
		// Code here
		int n = 0;
		if (head == null || k <= 0) {
			return - 1;
		}
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			n++;
		}
		
// 		System.out.println(n);
// 		double j = n / k;
		k = (int) Math.ceil((double)n / k)-1;
// 		System.out.println(k);
		temp = head;
		while (k > 0) {
			if (temp != null) {
				temp = temp.next;
			}
			k--;
		}
		return temp != null ? temp.data : -1;
	}
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-nk-th-node-in-linked-list/1)