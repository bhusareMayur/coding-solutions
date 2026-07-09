# Set Matrix Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`'s.

You must do it in place.

 

 **Example 1:** 

```
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

```

 **Example 2:** 

```
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

```

 

 **Constraints:** 

- m == matrix.length
- n == matrix[0].length
- 1 <= m, n <= 200
- -231 <= matrix[i][j] <= 231 - 1

 

 **Follow up:** 

- A straightforward solution using O(mn) space is probably a bad idea.
- A simple improvement uses O(m + n) space, but still not the best solution.
- Could you devise a constant space solution?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 98.56%)  
**Memory:** 47.7 MB (beats 25.45%)  
**Submitted:** 2026-07-09T05:42:45.677Z  

```java
class Solution {
    public void setZeroes(int[][] m) {
        int m1 = m.length;
        int n = m[0].length;
        // HashMap<Integer,Integer> mp = new HashMap<>();
        boolean row[] = new boolean[m1];
        boolean col[] = new boolean[n];


        for(int i = 0 ; i <m1;i++){
            for(int j = 0 ; j <n;j++){
                if(m[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0 ; i <m1;i++){
            for(int j = 0 ; j <n;j++){
                if(row[i] == true || col[j] == true) m[i][j] = 0;
            }
        }    
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/set-matrix-zeroes/)