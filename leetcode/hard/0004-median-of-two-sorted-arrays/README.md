# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 45 MB  
**Submitted:** 2026-07-08T07:11:34.094Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // with space O(1)
        int m = nums1.length;
        int n = nums2.length;
        int mn = m+n;

        int prev = 0;
        int curr = 0;
        int i = 0 ; 
        int j = 0;
        int k = 0;
        while(k != mn / 2){
            prev = curr;
            if(nums1[i] < nums2[j]){
                curr = nums1[i];
                i++;
            }else{
                curr = nums2[j];
                j++;
            }
            k++;
        }
    if(mn % 2 == 0){
        return (double)( prev + curr ) / 2.0;
    }

    return (double)curr;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)