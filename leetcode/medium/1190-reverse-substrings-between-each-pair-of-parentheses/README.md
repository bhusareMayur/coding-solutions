# Reverse Substrings Between Each Pair of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should  **not**  contain any brackets.

 

 **Example 1:** 

```
Input: s = "(abcd)"
Output: "dcba"

```

 **Example 2:** 

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

 **Example 3:** 

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s only contains lower case English characters and parentheses.
- It is guaranteed that all parentheses are balanced.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 44.83%)  
**Memory:** 43 MB (beats 85.97%)  
**Submitted:** 2026-09-27T16:09:44.887Z  

```java
class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s); 

        for(int i = 0 ;i<sb.length();i++){
            if(s.charAt(i) == '(') st.push(i);
            else if(s.charAt(i) == ')') rev(sb , st.pop() , i);
            else continue;
        }
        // return sb.toString();
          StringBuilder ans = new StringBuilder();
        for(int i = 0;i < sb.length();i++){
            if(sb.charAt(i) == '(' || sb.charAt(i) == ')') continue;

            ans.append(sb.charAt(i));
        }

        return ans.toString();
    }
    public static void rev(StringBuilder sb, int i, int j) {
    int left = i;
    int right = j - 1;

    while (left < right) {
        char temp = sb.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, temp);
        
        left++;
        right--;
    }
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)