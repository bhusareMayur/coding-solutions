# K Closest Points to Origin

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of `points` where `points[i] = [xi, yi]` represents a point on the  **X-Y**  plane and an integer `k`, return the `k` closest points to the origin `(0, 0)`.

The distance between two points on the  **X-Y**  plane is the Euclidean distance (i.e., `√(x1 - x2)2 + (y1 - y2)2`).

You may return the answer in  **any order**. The answer is  **guaranteed**  to be  **unique**  (except for the order that it is in).

 

 **Example 1:** 

```
Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].

```

 **Example 2:** 

```
Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.

```

 

 **Constraints:** 

- 1 <= k <= points.length <= 104
- -104 <= xi, yi <= 104

## Solution

**Language:** Java  
**Runtime:** 41 ms (beats 15.99%)  
**Memory:** 56.6 MB (beats 29.25%)  
**Submitted:** 2026-08-05T08:11:02.551Z  

```java
class Solution {
    public int[][] kClosest(int[][] p, int k) {
        int m = p.length;
        // int n = p[0].length;
        float[][] r = new float[m][2];


        for(int i = 0;i<m;i++){
            int x = p[i][0];
            int y = p[i][1];
            r[i][0] = i;
            r[i][1] = (float)Math.sqrt((x*x) + (y*y));
        }
      
         Arrays.sort(r, (a, b) -> Float.compare(a[1], b[1]));

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < k;i++){
            list.add(new ArrayList<>(Arrays.asList(p[(int)r[i][0]][0], p[(int)r[i][0]][1])));
        }

        int[][] ans = new int[list.size()][2];
        for(int i = 0 ; i < list.size();i++){
             ArrayList<Integer> pair = list.get(i);
    
             ans[i][0] = pair.get(0);
            ans[i][1] = pair.get(1);
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/k-closest-points-to-origin/)