# 3Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

 

 **Example 1:** 

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

```

 **Example 2:** 

```
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

```

 **Example 3:** 

```
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

```

 

 **Constraints:** 

- 3 <= nums.length <= 3000
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 29 ms (beats 93.69%)  
**Memory:** 59.1 MB (beats 59.71%)  
**Submitted:** 2026-07-08T06:49:13.013Z  

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i <n-2;i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i] > 0) break;
            int y = i + 1;
            int z = n - 1;
            while(y<z){
                int sum = nums[i] + nums[y] + nums[z];
                if(sum == 0){
                    ans.add((Arrays.asList(nums[i], nums[y], nums[z])));

                    while(y < z && nums[y] == nums[y+1])y++;
                    while(y<z && nums[z] == nums[z-1])z--;
                    y++;
                    z--;
                }
                else if(sum > 0){
                    z--;
                }else y++;
            }
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum/)