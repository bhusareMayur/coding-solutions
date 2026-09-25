# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 28.29%)  
**Memory:** 46.5 MB (beats 33.12%)  
**Submitted:** 2026-09-25T08:03:30.236Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        return map1.equals(map2);

    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)