# Add Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two  **non-empty**  linked lists representing two non-negative integers. The digits are stored in  **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

 **Example 1:** 

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

```

 **Example 2:** 

```
Input: l1 = [0], l2 = [0]
Output: [0]

```

 **Example 3:** 

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

```

 

 **Constraints:** 

- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 46.6 MB (beats 38.12%)  
**Submitted:** 2026-09-24T09:56:05.076Z  

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        int carry = 0;
        ListNode ans = new  ListNode(-1);
        ListNode res = ans;

        while(a != null && b != null){
            int sum = a.val + b.val + carry;
            carry = sum / 10;
            int t = sum % 10;
            ListNode temp = new ListNode(t);
            res.next = temp;
            res = res.next;
            a = a.next;
            b = b.next;
        }

        while(a != null){
            int sum = a.val + carry;
            carry = sum / 10;
            int t = sum % 10;
            ListNode temp = new ListNode(t);
            res.next = temp;
            res = res.next;
            a = a.next;
            // b = b.next;
        }
        while(b != null){
            int sum = b.val + carry;
            carry = sum / 10;
            int t = sum % 10;
            ListNode temp = new ListNode(t);
            res.next = temp;
            res = res.next;
            // a = a.next;
            b = b.next;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            res.next = temp;
            res = res.next;
        }
        return ans.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/add-two-numbers/)