# Top K Frequent Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `k`  *most frequent elements*. You may return the answer in  **any order**.

 

 **Example 1:** 

 **Input:**  nums = [1,1,1,2,2,3], k = 2

 **Output:**  [1,2]

 **Example 2:** 

 **Input:**  nums = [1], k = 1

 **Output:**  [1]

 **Example 3:** 

 **Input:**  nums = [1,2,1,2,1,2,3,1,3,2], k = 2

 **Output:**  [1,2]

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- k is in the range [1, the number of unique elements in the array].
- It is guaranteed that the answer is unique.

 

 **Follow up:**  Your algorithm's time complexity must be better than `O(n log n)`, where n is the array's size.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.9 MB  
**Submitted:** 2026-07-08T08:19:43.777Z  

```java
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Arrays.sort(nums);
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
          int[] ans = new int[k];
         
          for(int i = 0 ; i <k;i++){
            int maxiF = Integer.MIN_VALUE;
            int maxi = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if(maxiF < e.getValue()){
                    maxi = e.getKey();
                    maxiF = e.getValue();
                }else continue;
            } 
            map.put(maxi , 0);
            ans[i] = maxi;
 
          }
        return ans;    
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/top-k-frequent-elements/)