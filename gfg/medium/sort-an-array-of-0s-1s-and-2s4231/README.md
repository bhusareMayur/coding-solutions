# Sort 0s, 1s and 2s

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]**  containing only **0s, 1s, and 2s.**  Sort the array in ascending order. 
 **Note:**  You need to solve this problem without utilizing the built-in sort function.

 **Examples:** 

```
Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

```
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
```

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T06:29:17.816Z  

```java
class Solution {
    public void sort012(int[] arr) {
        // code here
        int z = 0;
        int o = 0;
        int t = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == 0) z++;
            else if(arr[i] == 1) o++;
            else t++;
        }
        
       int i = 0;
       while(z > 0){
           arr[i] = 0;
           i++;
           z--;
       }
       while(o > 0){
           arr[i] = 1;
           i++;
           o--;
       }
       while(t > 0){
           arr[i] = 2;
           i++;
           t--;
       }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1)