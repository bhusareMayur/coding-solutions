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
**Runtime:** 30 ms (beats 73.76%)  
**Memory:** 95.7 MB (beats 27.32%)  
**Submitted:** 2026-09-20T12:43:17.160Z  

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ; i<n;i++){
            s.add(nums[i]);
        }
        int maxLength = 0;
        for(int num : s){
            if(!s.contains(num - 1)){
            int currLength = 1;
            int temp = num;
            while(s.contains(temp+1)){
               temp++;
               currLength++;
            }
            maxLength = Math.max(currLength,maxLength);
         }
        }
        return maxLength;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)