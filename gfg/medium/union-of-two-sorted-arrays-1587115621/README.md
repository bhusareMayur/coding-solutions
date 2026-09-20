# Union of 2 Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two sorted arrays  **a[]**  and  **b[]**, where each array may contain duplicate elements, the task is to return the elements in the union of the two arrays in sorted order. Union of two arrays can be defined as the set containing distinct elements that are present in either of the arrays.

 **Examples:** 

```
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
```

```
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: [1, 2, 3, 4, 5]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
```

```
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: [1, 2]
Explanation: Distinct elements including both the arrays are: 1 2.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T05:45:01.814Z  

```java
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        int i = 0 ; 
        int j = 0;
        
        while(i < n1 && j < n2){
            if(a[i] < b[j]){
                set.add(a[i]);
                i++;
            }else{
                set.add(b[j]);
                j++;
            }
            
        }
        
        while(i < n1){
          set.add(a[i]);
          i++;
        }
        while(j < n2){
          set.add(b[j]);
          j++;
        }
       
        
        
        return new ArrayList<>(set);
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1)