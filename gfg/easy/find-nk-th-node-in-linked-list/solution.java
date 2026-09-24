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
