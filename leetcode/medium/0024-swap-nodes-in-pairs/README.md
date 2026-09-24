# Swap Nodes in Pairs

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

 **Example 1:** 

 **Input:**  head = [1,2,3,4]

 **Output:**  [2,1,4,3]

 **Explanation:** 

 **Example 2:** 

 **Input:**  head = []

 **Output:**  []

 **Example 3:** 

 **Input:**  head = [1]

 **Output:**  [1]

 **Example 4:** 

 **Input:**  head = [1,2,3]

 **Output:**  [2,1,3]

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 100].
- 0 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 48.18%)  
**Submitted:** 2026-09-24T11:09:26.706Z  

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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode a = head;
        ListNode b = head.next;
        while(a != null && b != null){
            int temp = a.val;
            a.val = b.val;
            b.val = temp;
            
            if(a.next == null || a.next.next == null || b.next == null || b.next.next == null) break;
            a = a.next.next;
            b = b.next.next;
        }
        return head;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/swap-nodes-in-pairs/)