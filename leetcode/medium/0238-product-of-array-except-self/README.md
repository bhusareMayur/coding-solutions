# Product of Array Except Self

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, return  *an array*  `answer`  *such that*  `answer[i]`  *is equal to the product of all the elements of*  `nums`  *except*  `nums[i]`.

The product of any prefix or suffix of `nums` is  **guaranteed**  to fit in a  **32-bit**  integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

 

 **Example 1:** 

```
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

```

 **Example 2:** 

```
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

```

 

 **Constraints:** 

- 2 <= nums.length <= 105
- -30 <= nums[i] <= 30
- The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

 

 **Follow up:**  Can you solve the problem in `O(1)` extra space complexity? (The output array  **does not**  count as extra space for space complexity analysis.)

## Solution

**Language:** Java  
**Runtime:** 350 ms (beats 2.83%)  
**Memory:** 69.8 MB (beats 68.12%)  
**Submitted:** 2026-09-21T06:24:14.859Z  

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] p = new int[n];
        int s = 1;
        // int[] s = new int[n];
        p[0]=1;
        // s[n-1] = 1;
        for(int i = 1 ; i <n;i++){
            p[i] = p[i-1]*nums[i-1];
            System.out.print(p[i]+" , ");
        }
        // for(int i =n-2 ; i >=0;i--){
        //     s[i] = s[i+1]*nums[i+1];
        //     // System.out.print(s[i]+" , ");
        // }
        // for(int i = 0 ; i < n;i++){
        //     p[i] = p[i] * s[i];
        // }
        for(int i = n-1 ; i >=0;i--){
            p[i] *= s;
            s *= nums[i];
        }

        return p;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/product-of-array-except-self/)