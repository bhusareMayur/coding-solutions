# Frequency in a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a singly linked list and a key, count the number of occurrences of the given key in the linked list.

 **Examples:** 

```
Input: head: 1->2->1->2->1->3->1, key = 1

Output: 4
Explanation: 1 appears 4 times. 
```

```
Input: head: 1->2->1->2->1, key = 3

Output: 0
Explanation: 3 appears 0 times.
```

 **Constraints:** 
1 ≤ number of nodes, key ≤ 105
1 ≤ data of node ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T05:16:30.125Z  

```java
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    public int count(Node head, int key) {
        // code here
        int ans = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key) ans++;
            temp = temp.next;
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1)