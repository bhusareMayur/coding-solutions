# second-largest3735

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T05:34:50.848Z  

```java
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int FG = Integer.MIN_VALUE;
        int SG = Integer.MIN_VALUE;
        
        for(int i = 0 ; i <n;i++){
            if(arr[i] > FG){
                SG = FG;
                FG = arr[i];
            }
            else if(arr[i] > SG && arr[i] != FG) SG = arr[i];
        }
        if(SG < 0) return -1;
        return SG;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/second-largest3735/1)