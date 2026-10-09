# Insert Interval

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of non-overlapping intervals `intervals` where `intervals[i] = [starti, endi]` represent the start and the end of the `ith` interval and `intervals` is sorted in ascending order by `starti`. You are also given an interval `newInterval = [start, end]` that represents the start and end of another interval.

Two intervals are considered overlapping if they share  **at least**  one point.

Insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order by `starti` and `intervals` still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return `intervals` *after the insertion*.

 **Note**  that you don't need to modify `intervals` in-place. You can make a new array and return it.

 

 **Example 1:** 

```
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]

```

 **Example 2:** 

```
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].

```

 

 **Constraints:** 

- 0 <= intervals.length <= 104
- intervals[i].length == 2
- 0 <= starti <= endi <= 105
- intervals is sorted by starti in ascending order.
- newInterval.length == 2
- 0 <= start <= end <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 97.97%)  
**Memory:** 47.4 MB (beats 6.99%)  
**Submitted:** 2026-10-07T16:31:13.993Z  

```java
class Solution {
    public int[][] insert(int[][] arr, int[] newInterval) {
        // Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int a = newInterval[0];
        int b = newInterval[1];
        if(arr.length == 0){
            return new int[][] {{a,b}};
        }
        int[][] extendedArr = new int[arr.length + 1][2];
        int idx = 0;
        boolean inserted = false;
        for (int[] interval : arr) {
            if (!inserted && a < interval[0]) {
                extendedArr[idx++] = newInterval;
                inserted = true;
            }
            extendedArr[idx++] = interval;
        }
        if (!inserted) {
            extendedArr[idx] = newInterval;
        }
        arr = extendedArr; 
        
        List<int[]> ans = new ArrayList<>();

        int prevStart = arr[0][0];
        int prevEnd = arr[0][1];
        for(int i = 1 ; i < arr.length;i++){
            if(a <= prevEnd){
                prevEnd = Math.max(prevEnd, b);
                // i--;
            }
            if(arr[i][0] <= prevEnd){
                prevEnd = Math.max(prevEnd, arr[i][1]);

            }
            else{
                ans.add(new int[]{prevStart, prevEnd});
                prevStart = arr[i][0];
                prevEnd = arr[i][1];

            }
        }
        ans.add(new int[]{prevStart, prevEnd});
        return ans.toArray(new int[ans.size()][]);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/insert-interval/)