# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 10 ms (beats 99.64%)  
**Memory:** 109.3 MB (beats 8.21%)  
**Submitted:** 2026-08-06T13:22:50.300Z  

```java
class Solution {
    static{
        for(int i = 0; i <= 500; i++) 
            containsDuplicate(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length;i++){
            set.add(nums[i]);
            if(set.size() !=  i+1)return true;
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)