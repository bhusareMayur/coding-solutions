# Queue Reversal

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a queue  **q** containing integer elements, your task is to  **reverse**  the queue.

 **Examples:** 

```
Input: q[] = [5, 10, 15, 20, 25]
Output: [25, 20, 15, 10, 5]
Explanation: After reversing the given elements of the queue, the resultant queue will be 25 20 15 10 5.

```

```
Input: q[] = [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
Explanation: After reversing the given elements of the queue, the resultant queue will be 5 4 3 2 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T08:12:05.811Z  

```java
class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/queue-reversal/1)