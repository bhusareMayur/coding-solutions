# Concatenate Non-Zero Digits and Multiply by Sum I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`.

Form a new integer `x` by concatenating all the  **non-zero digits**  of `n` in their original order. If there are no  **non-zero**  digits, `x = 0`.

Let `sum` be the  **sum of digits**  in `x`.

Return an integer representing the value of `x * sum`.

 

 **Example 1:** 

 **Input:**  n = 10203004

 **Output:**  12340

 **Explanation:** 

- The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
- The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
- Therefore, the answer is x  *sum = 1234*  10 = 12340.

 **Example 2:** 

 **Input:**  n = 1000

 **Output:**  1

 **Explanation:** 

- The non-zero digit is 1, so x = 1 and sum = 1.
- Therefore, the answer is x  *sum = 1*  1 = 1.

 

 **Constraints:** 

- 0 <= n <= 109

## Solution

**Language:** unknown  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-07T14:50:21.515Z  

```unknown
1class Solution {
2    public int maxDigitRange(int[] nums) {
3        int n = nums.length;
4
5        int maxi = -1;
6        int ans = 0;
7
8        for(int i = 0 ; i < n;i++){
9            int t= nums[i];
10            int mini = 9;
11            int maxD = 0;
12
13            while(t>0){
14                int d = t%10;
15                if(d<mini) mini = d;
16                if(d>maxD) maxD = d;
17                t/=10;
18            }
19
20            int diff = maxD - mini;
21            if(diff > maxi){
22                maxi = diff;
23                ans = nums[i];
24            }else if(diff == maxi){
25                ans += nums[i];
26            }
27        }
28        return ans;
29    }
30}
```

---

[View on LeetCode](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/)