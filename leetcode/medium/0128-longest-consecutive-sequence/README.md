# Longest Consecutive Sequence

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of integers `nums`, return  *the length of the longest consecutive elements sequence.* 

You must write an algorithm that runs in `O(n)` time.

 

 **Example 1:** 

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

```

 **Example 2:** 

```
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

```

 **Example 3:** 

```
Input: nums = [1,0,1,2]
Output: 3

```

 

 **Constraints:** 

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 2 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-09-20T12:03:43.558Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) return 1;
        int maxLength=0;
        int l = 0;
        int r = 0;
        int d = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) {
                d++;
                continue;
            }

            if(nums[i] == nums[i-1]+1){
                r=i;
            }else{
                l=i;
            }
            maxLength = Math.max(maxLength,r-l+1-d);
        }
        return maxLength;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)