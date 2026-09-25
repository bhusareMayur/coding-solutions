# Reverse Nodes in k-Group

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given the `head` of a linked list, reverse the nodes of the list `k` at a time, and return  *the modified list*.

`k` is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of `k` then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]

```

 **Example 2:** 

```
Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]

```

 

 **Constraints:** 

- The number of nodes in the list is n.
- 1 <= k <= n <= 5000
- 0 <= Node.val <= 1000

 

 **Follow-up:**  Can you solve the problem in `O(1)` extra memory space?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 33.48%)  
**Memory:** 46.2 MB (beats 88.09%)  
**Submitted:** 2026-09-25T05:23:42.745Z  

```java
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
        ListNode tail = head;
        ListNode curr = head;
        ListNode prev = null;

        while(temp != null){
            int i = k;
            curr = temp;
            tail = temp;
            // prev = tail;
            ListNode check = temp;
            for(int c = 1; c < k; c++) {
                if(check == null || check.next == null) return head;
                check = check.next;
            }
            while(i > 1){
                if(tail == null){
                    // break;
                    return head;
                }
                // prev = tail;
                tail = tail.next;
                
                i--;
            }
            if(tail != null){
            temp = tail.next;
            reverse(curr , tail);
            if(curr == head){// first reverse
                head = tail;
            }else{
                prev.next = tail;
            }
            curr.next = temp;
            prev = curr;
            }else{
                temp = tail;
            }

        }
        return head;
        
    }
    public void reverse(ListNode s , ListNode e){
        ListNode prev = null;
        ListNode current = s;
        ListNode nextNode = null;
        
        ListNode stopNode = e.next; 

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

[View on LeetCode](https://leetcode.com/problems/reverse-nodes-in-k-group/)