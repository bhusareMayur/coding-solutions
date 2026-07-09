# Search a 2D Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` integer matrix `matrix` with the following two properties:

- Each row is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true`  *if*  `target`  *is in*  `matrix`  *or*  `false`  *otherwise*.

You must write a solution in `O(log(m * n))` time complexity.

 

 **Example 1:** 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

```

 **Example 2:** 

```
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[i].length
- 1 <= m, n <= 100
- -104 <= matrix[i][j], target <= 104

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-07-09T06:28:29.390Z  

```java
class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int m = arr.length;
        int n = arr[0].length;
        if(n == 1 && m == 1) {
            if(arr[0][0] == t) return true;
            else return false;
        }
        
        int i =0;
        int j = m - 1;
        int mid = 0;

        while(i < j){
             mid = (i + j) / 2;
            if(arr[0][mid] == t) return true;
            if(arr[0][mid] < t){
                j = mid-1;
            }
            else{
                i = mid;
            }
        }
         i =0;
         j = n - 1;
        while(i < j){
            int mid2 = (i+j)/2;
            if(arr[mid][mid2] == t) return true;
            else if(arr[mid][mid2] < t) i = mid+1;
            else j = mid -1;
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/search-a-2d-matrix/)