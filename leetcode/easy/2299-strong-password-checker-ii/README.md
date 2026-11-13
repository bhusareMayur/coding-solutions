# Strong Password Checker II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A password is said to be  **strong**  if it satisfies all the following criteria:

- It has at least 8 characters.
- It contains at least one lowercase letter.
- It contains at least one uppercase letter.
- It contains at least one digit.
- It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
- It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).

Given a string `password`, return `true` *if it is a  **strong**  password*. Otherwise, return `false`.

 

Original
Java
 **Example 1:** 

```
Input: password = "IloveLe3tcode!"
Output: true
Explanation: The password meets all the requirements. Therefore, we return true.

```

 **Example 2:** 

```
Input: password = "Me+You--IsMyDream"
Output: false
Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.

```

 **Example 3:** 

```
Input: password = "1aB!"
Output: false
Explanation: The password does not meet the length requirement. Therefore, we return false.
```

 

 **Constraints:** 

- 1 <= password.length <= 100
- password consists of letters, digits, and special characters: "!@#$%^&*()-+".

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 79.20%)  
**Memory:** 42.2 MB (beats 94.04%)  
**Submitted:** 2026-11-13T06:33:19.226Z  

```java
class Solution {
    public boolean strongPasswordCheckerII(String p) {
        int n = p.length();
        if(n < 8) return false;
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
        boolean l = false;
        boolean u = false;
        boolean d = false;
        boolean s = false;
        // boolean a = false;


        for(int i = 0;i<n;i++){
            char t = p.charAt(i);
            if(i != 0 && (t == p.charAt(i-1))) return false;
            if(Character.isLowerCase(t)){
                l = true;
            }
            else if(Character.isUpperCase(t)){
                u = true;
            }
            else if(Character.isDigit(t)){
                d = true;
            }
            else if(specialChars.indexOf(t) != -1){
                s = true;
            }
            
        }
        return l && u && s && d;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/strong-password-checker-ii/)