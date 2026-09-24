# Double a Number Represented as a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a  **non-empty**  linked list representing a non-negative integer without leading zeroes.

Return  *the* `head` *of the linked list after  **doubling**  it*.

 

 **Example 1:** 

```
Input: head = [1,8,9]
Output: [3,7,8]
Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.

```

 **Example 2:** 

```
Input: head = [9,9,9]
Output: [1,9,9,8]
Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998. 

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 104]
- 0 <= Node.val <= 9
- The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 79.60%)  
**Memory:** 48.5 MB (beats 49.57%)  
**Submitted:** 2026-09-24T05:53:42.850Z  

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
    public ListNode doubleIt(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;      
            current = next;
        }
        head = prev;

        ListNode temp = head;
        int carry = 0;
        ListNode b = temp;
        while(temp != null){
            // int val = temp.val;
            int val = ((temp.val * 2 ) + carry);
            carry = 0;
            if(val > 9){
                temp.val = val % 10;
                carry = 1;
            }
            else
            temp.val = val;
            b = temp;
            temp = temp.next;

        }
        if(carry != 0){
            ListNode a = new ListNode(carry);
            b.next = a;
        }

         prev = null;
         current = head;
         next = null;

        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;      
            current = next;
        }
     return prev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/)