# Add 1 to a Linked List Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given head of a linked list where each node contains a single digit. The digits together represent a number formed by concatenating the node values in order. Add 1 to this number and return the head of the modified linked list.

 **Examples :** 

```
Input: Head: 4->5->6
Output: 457

Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 

```

```
Input: Head: 1->2->3
Output: 124
 
Explanation:  1->2->3 represents 123 and when 1 is added it becomes 124. 
```

```
Input: Head: 0->0->1
Output: 002
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T10:10:00.208Z  

```java
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        if(head == null) return null;
          Node prev = null;
           Node current = head;
           Node next = null;
        if(head.next != null){
            

           while (current != null) {
               next = current.next; 
               current.next = prev; 
               prev = current;       
               current = next;      
           }
           head = prev;
        }
           
           
           int carry = 1;
           Node temp = head;
           Node t2 = temp;
           while(temp != null){
              int sum = temp.data + carry;
              carry = sum / 10;
              int t = sum % 10;
              
              temp.data = t;
              t2 = temp;
              temp = temp.next;
           }
           
           if(carry != 0){
               Node a = new Node(carry);
               t2.next = a;
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

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)