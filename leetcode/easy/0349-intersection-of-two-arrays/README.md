# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 19.01%)  
**Memory:** 45 MB (beats 40.80%)  
**Submitted:** 2026-09-19T06:21:08.706Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i<n1-1;i++){
            if(nums1[i] != nums1[i+1]){
                if(BS(nums2,0,n2-1,nums1[i])){
                    //add
                    ans.add(nums1[i]);
                }
            }
        }
        // add last element
        if(BS(nums2,0,n2-1,nums1[n1 - 1])){
            ans.add(nums1[n1-1]);
        }
      
      int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
    public boolean BS(int[] nums2 ,int i,int j, int temp){

        while(i <= j){
        int mid = (i + j) / 2;
        if(temp == nums2[mid]) return true;

        else if(nums2[mid] > temp){
            j = mid-1;
        }
        else{
            i = mid+1;
        }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)