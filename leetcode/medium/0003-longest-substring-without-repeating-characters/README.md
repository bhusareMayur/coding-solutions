# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 5 * 104
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 18.50%)  
**Memory:** 46.9 MB (beats 9.03%)  
**Submitted:** 2026-07-27T16:06:20.482Z  

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int l = 0;
        int r = 0;

        while(r < n){
            char c = s.charAt(r);
            // not in string
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
                ans = Math.max(ans , sb.length());
                r++;

            }
            //in string 
            else{
                int j = sb.indexOf(String.valueOf(c));
                sb.delete(0, j + 1);
                for(int i = 0; i <= r;i++){
                    if(s.charAt(l) == c) {
                        l++;
                        break;
                        }
                    l++;
                }

            }

        }
        return ans;

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)