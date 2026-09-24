# Rotate List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, rotate the list to the right by `k` places.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]

```

 **Example 2:** 

```
Input: head = [0,1,2], k = 4
Output: [2,0,1]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 500].
- -100 <= Node.val <= 100
- 0 <= k <= 2 * 109

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.3 MB (beats 44.03%)  
**Submitted:** 2026-09-24T05:13:55.517Z  

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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        if(n == 0) return null;
        if(k % n == 0)return head;
        int j = n - (k % n)-1;
         temp = head;

        for(int i = 0 ;i<j;i++){
            temp = temp.next;
        }
        ListNode dummy = temp.next;
        temp.next = null;
        ListNode ans = dummy;
        while(dummy.next != null){
            dummy = dummy.next;
        }
        dummy.next = head;
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/rotate-list/)