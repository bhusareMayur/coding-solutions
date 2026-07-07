# Delete N nodes after M nodes of a linked list

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a linked list, delete  **n**  nodes after skipping  **m**  nodes of a linked list until the last of the linked list.
 **Examples:** 

```
Input: Linked List: 9->1->3->5->9->4->10->1, n = 1, m = 2

Output: 9->1->5->9->10->1

Explanation: Deleting 1 node after skipping 2 nodes each time, we have list as 9-> 1-> 5-> 9-> 10-> 1.
```

```
Input: Linked List: 1->2->3->4->5->6, n = 1, m = 6

Output: 1->2->3->4->5->6

Explanation: After skipping 6 nodes for the first time, we will reach of end of the linked list, so, we will get the given linked list itself.
```

 **Expected Time Complexity** : O(n)
 **Expected Space Complexity** : O(1)

 **Constraints** :
1 <= size of linked list <= 1000
0 < n, m <= size of linked list

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T14:59:32.836Z  

```java
/*
delete n nodes after m nodes
The input list will have at least one element
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution {
    static void linkdelete(Node head, int n, int m) {
        // your code here
        Node temp = head;
        while (temp != null) {
        int i = 1;
        while(i < m && temp != null){
         temp = temp.next;   
         i++;
        }
        
         if (temp == null) return;

            Node temp2 = temp.next;

        
            i = 1;
            while (i <= n && temp2 != null) {
                temp2 = temp2.next;
                i++;
            }
            temp.next = temp2;

            temp = temp2;
        
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1)