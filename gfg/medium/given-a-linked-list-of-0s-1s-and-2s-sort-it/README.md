# Sort a linked list of 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **head**  of a linked list where nodes can contain values  **0s**,  **1s,**  and  **2s** only. Your task is to  **rearrange**  the list so that all  **0s**  appear at the beginning, followed by all  **1s**, and all  **2s**  are placed at the end.

 **Examples:** 

```
Input: head = 1 → 2 → 2 → 1 → 2 → 0 → 2 → 2
   
Output: 0 → 1 → 1 → 2 → 2 → 2 → 2 → 2
Explanation: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between. The final list will be:
   
```

```
Input: head = 2 → 2 → 0 → 1
   
Output: 0 → 1 → 2 → 2
Explanation: After arranging all the 0s, 1s and 2s in the given format, the output will be:
   
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T12:33:36.943Z  

```java
/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        Node z = new Node(-1);
        Node o = new Node(-1);
        Node t = new Node(-1);
        Node a = z;
        Node b = o;
        Node c = t;
        Node temp = head;
        
        while(temp != null){
            Node nextNode = temp.next;
            temp.next = null;
            
            if(temp.data == 0){
                z.next = temp;
                z = z.next;
            }
            else if(temp.data == 1){
                o.next = temp;
                o = o.next;
                
            }else{
                t.next = temp;
                t = t.next;
            }
            
            temp = nextNode;
        }
        z.next = (b.next != null) ? b.next : c.next;
        
        o.next = c.next;
        t.next = null;
        
        return a.next != null ? a.next : (b.next != null ? b.next : c.next);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1)