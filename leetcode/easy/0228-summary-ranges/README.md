# Summary Ranges

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a  **sorted unique**  integer array `nums`.

A  **range**  `[a,b]` is the set of all integers from `a` to `b` (inclusive).

Return  *the  **smallest sorted**  list of ranges that  **cover all the numbers in the array exactly***. That is, each element of `nums` is covered by exactly one of the ranges, and there is no integer `x` such that `x` is in one of the ranges but not in `nums`.

Each range `[a,b]` in the list should be output as:

- "a->b" if a != b
- "a" if a == b

 

 **Example 1:** 

```
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"

```

 **Example 2:** 

```
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"

```

 

 **Constraints:** 

- 0 <= nums.length <= 20
- -231 <= nums[i] <= 231 - 1
- All the values of nums are unique.
- nums is sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 96.16%)  
**Memory:** 42.7 MB (beats 93.05%)  
**Submitted:** 2026-10-06T04:36:40.116Z  

```java
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        if(n == 0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();

        int start = nums[0];
        int end = nums[0];
        for(int i = 1 ;i <n;i++){
            if(nums[i] == end + 1){
                end = nums[i];
            }else{
                StringBuilder sb = new StringBuilder();
                if(start == end) sb.append(start+"");
                else{
                sb.append(start+"");
                sb.append("->");
                sb.append(end+"");
                }
                ans.add(sb.toString());
                
                start = nums[i];
                end = start;
                
            }
            
        }
        StringBuilder sb = new StringBuilder();
                if(start == end) sb.append(start+"");
                else{
                sb.append(start+"");
                sb.append("->");
                sb.append(end+"");
                }
                ans.add(sb.toString());
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/summary-ranges/)