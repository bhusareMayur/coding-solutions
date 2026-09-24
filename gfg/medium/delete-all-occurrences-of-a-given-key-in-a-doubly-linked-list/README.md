# Delete All Occurrences in DLL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the head of a doubly Linked List and a key  **x** . Delete all occurrences of the given key x if it is present and return the new DLL.

 **Examples:** 

```
Input: 2<->2<->10<->8<->4<->2<->5<->2, x = 2

Output:  10<->8<->4<->5

Explanation: 
All Occurrences of 2 have been deleted.

```

```
Input: head = 9<->1<->3<->4<->5<->1<->8<->4, x = 9

Output: 1<->3<->4<->5<->1<->8<->4

Explanation: 
All Occurrences of 9 have been deleted.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T09:43:11.296Z  

```java
/*Structure of the doubly linked list  Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/

class Solution {
    public Node deleteAllOccurOfX(Node head, int x) {
        // code here
        if(head == null) return null;
        Node temp = head;
        while(temp != null){
            if(temp.data == x){
                if(temp == head) head = temp.next;
                
                if(temp.prev != null){
                  temp.prev.next = temp.next;
                } 
                if(temp.next != null){
                  temp.next.prev = temp.prev;
                } 

        }
            temp = temp.next;
        }
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1)