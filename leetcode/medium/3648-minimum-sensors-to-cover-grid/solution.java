class Solution {
    public int minSensors(int n, int m, int k) {
        int ans = Math.max(m,n) - k;
        if(ans == 0) return 1;
        return ans;
    }
}