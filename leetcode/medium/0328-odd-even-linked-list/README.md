# Odd Even Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return  *the reordered list*.

The  **first**  node is considered  **odd**, and the  **second**  node is  **even**, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in `O(1)` extra space complexity and `O(n)` time complexity.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

```

 **Example 2:** 

```
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

```

 

 **Constraints:** 

- The number of nodes in the linked list is in the range [0, 104].
- -106 <= Node.val <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 46.4 MB (beats 55.12%)  
**Submitted:** 2026-09-24T11:00:12.732Z  

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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        int i = 1;
        ListNode temp = head;
        // ListNode prev = temp;
        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-1);
        ListNode a = odd;
        ListNode b = even;

        while(temp != null){
            ListNode nextNode = temp.next;
            temp.next = null; 
            if(i % 2 == 0){
                even.next = temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            temp = nextNode;
            i++;
        }
        odd.next = b.next;
     return a.next; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/odd-even-linked-list/)