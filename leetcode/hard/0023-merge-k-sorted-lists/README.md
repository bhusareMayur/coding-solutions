# Merge k Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of `k` linked-lists `lists`, each linked-list is sorted in ascending order.

 *Merge all the linked-lists into one sorted linked-list and return it.* 

 

 **Example 1:** 

```
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6

```

 **Example 2:** 

```
Input: lists = []
Output: []

```

 **Example 3:** 

```
Input: lists = [[]]
Output: []

```

 

 **Constraints:** 

- k == lists.length
- 0 <= k <= 104
- 0 <= lists[i].length <= 500
- -104 <= lists[i][j] <= 104
- lists[i] is sorted in ascending order.
- The sum of lists[i].length will not exceed 104.

## Solution

**Language:** Java  
**Runtime:** 158 ms (beats 5.03%)  
**Memory:** 46.8 MB (beats 46.61%)  
**Submitted:** 2026-09-25T06:52:31.532Z  

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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 1)
            return lists[0];
        if (n == 0)
            return null;
        ListNode t1 = lists[0];
        for (int i = 1; i < n; i++) {
            ListNode res = new ListNode(-1);
            ListNode ans = res;
            ListNode t2 = lists[i];
            ans = res;
            while (t1 != null && t2 != null) {
                if (t1.val < t2.val) {
                    res.next = t1;
                    t1 = t1.next;
                } else {
                    res.next = t2;
                    t2 = t2.next;
                }
                res = res.next;

            }
            while (t1 != null) {
                res.next = t1;
                res = res.next;
                t1 = t1.next;
            }
            while (t2 != null) {
                res.next = t2;
                res = res.next;
                t2 = t2.next;
            }

            t1 = ans.next;
        }
        return t1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-k-sorted-lists/)