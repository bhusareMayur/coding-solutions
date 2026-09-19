# Find the Duplicate Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only  **one repeated number**  in `nums`, return  *this repeated number*.

You must solve the problem  **without**  modifying the array `nums` and using only constant extra space.

 

 **Example 1:** 

```
Input: nums = [1,3,4,2,2]
Output: 2

```

 **Example 2:** 

```
Input: nums = [3,1,3,4,2]
Output: 3

```

 **Example 3:** 

```
Input: nums = [3,3,3,3,3]
Output: 3
```

 

 **Constraints:** 

- 1 <= n <= 105
- nums.length == n + 1
- 1 <= nums[i] <= n
- All the integers in nums appear only once except for precisely one integer which appears two or more times.

 

 **Follow up:** 

- How can we prove that at least one duplicate number must exist in nums?
- Can you solve the problem in linear runtime complexity?

## Solution

**Language:** Java  
**Runtime:** 39 ms (beats 5.93%)  
**Memory:** 79.1 MB (beats 94.73%)  
**Submitted:** 2026-09-19T07:20:57.279Z  

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < n-1;i++){
            if(nums[i] == nums[i+1]) return nums[i];
        }
        return nums[0];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-the-duplicate-number/)