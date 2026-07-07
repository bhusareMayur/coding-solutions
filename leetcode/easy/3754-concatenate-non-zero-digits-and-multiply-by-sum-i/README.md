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
**Submitted:** 2026-07-07T13:17:53.771Z  

```unknown
1class Solution {
2    public int divisibleGame(int[] nums) {
3        int n = nums.length;
4        Set<Integer> st = new HashSet<>();
5
6        for(int i = 0 ; i <n;i++){
7            int t = nums[i];
8
9            for(int j = 2;j*j <= t;j++){
10                if(t%j == 0){
11                    st.add(j);
12                    while(t % j == 0) t/=j;
13                }
14            }
15            if(t>1) st.add(t);
16        }
17
18        if(st.isEmpty()) st.add(2);
19
20        long b = Long.MIN_VALUE;
21        int kAns = -1;
22
23        for(int k:st){
24            long curr = 0;
25            long maxi = Long.MIN_VALUE;
26            
27            for(int x:nums){
28                curr += (x % k == 0) ? x : -x;
29                if(curr > maxi ) maxi = curr;
30
31                if(curr < 0) curr = 0;
32            }
33            if(maxi > b || (maxi == b && k < kAns)){
34                b = maxi;
35                kAns = k;
36                
37            }
38        }
39
40        long mod = 1_000_000_007L;
41        
42        long ans = (((b % mod + mod) % mod) * kAns % mod);
43
44        return (int)ans;
45        
46        
47    }
48}
```

---

[View on LeetCode](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/)