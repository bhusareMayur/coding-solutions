# Minimum Add to Make Parentheses Valid

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A parentheses string is valid if and only if:

- It is the empty string,
- It can be written as AB (A concatenated with B), where A and B are valid strings, or
- It can be written as (A), where A is a valid string.

You are given a parentheses string `s`. In one move, you can insert a parenthesis at any position of the string.

- For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".

Return  *the minimum number of moves required to make* `s` *valid*.

 

 **Example 1:** 

```
Input: s = "())"
Output: 1

```

 **Example 2:** 

```
Input: s = "((("
Output: 3

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s[i] is either '(' or ')'.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-07-08T05:48:21.731Z  

```java
class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i = 0 ; i < n;i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                } else{
                    count++;
                }
            }
        }

        while(!st.isEmpty()){
            st.pop();
            count++;
        }
        return count;   
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)