# Squares of a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` sorted in  **non-decreasing**  order, return  *an array of  **the squares of each number**  sorted in non-decreasing order*.

 

 **Example 1:** 

```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

```

 **Example 2:** 

```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -104 <= nums[i] <= 104
- nums is sorted in non-decreasing order.

 

 **Follow up:**  Squaring each element and sorting the new array is very trivial, could you find an `O(n)` solution using a different approach?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 47.1 MB (beats 76.84%)  
**Submitted:** 2026-08-05T07:36:39.613Z  

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0 ;
        int j = n -1;
        int[] res = new int[n]; 
        int k = n-1;
        while(i <= j){
            int l = nums[i]*nums[i];
            int r = nums[j]*nums[j];
            if(l > r){
                res[k] = l;
                i++;
            }else{
                res[k] = r;
                j--;
            }
            k--;
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/)