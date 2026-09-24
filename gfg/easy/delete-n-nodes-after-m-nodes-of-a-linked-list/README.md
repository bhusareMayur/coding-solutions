# Delete N After Every M in Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a linked list, delete  **n**  nodes after skipping  **m**  nodes of a linked list until the last of the linked list.

 **Examples:** 

```
Input: head: 9 -> 1 -> 3 -> 5 -> 9 -> 4 -> 10 -> 1, n = 1, m = 2

Output: 9 -> 1 -> 5 -> 9 -> 10 -> 1

Explanation: Deleting 1 node after skipping 2 nodes each time, we have list as 9 -> 1 -> 5 -> 9 -> 10 -> 1.
```

```
Input: head: 1 -> 2 -> 3 -> 4 -> 5 -> 6, n = 1, m = 6

Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6

Explanation: After skipping 6 nodes for the first time, we will reach of end of the linked list, so, we will get the given linked list itself.
```

 **Constraints** :
1 <= size of linked list <= 104
1 <= n, m <= size of linked list

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T09:13:42.092Z  

```java
/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node temp = head;
        while(temp != null){
            int i = m;
            int j = n;
        while(temp != null && i > 1){
            temp = temp.next;
            i--;
        }
        // System.out.println(temp.data);
        Node temp2 = temp;
         while(temp2 != null && j >= 0){
            temp2 = temp2.next;
            j--;
        }
        if(temp2 == null){
        if(temp != null) 
            temp.next = null;
            
            break;
        }
            
        
        temp.next = temp2;
        if(temp.next == null) continue;
        temp = temp.next;
        
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1)