class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int i = 0;
        int j = k - 1;
        while(j < n){
            int maxi = Integer.MIN_VALUE;
            for(int x = i;x <= j;x++){
                if(nums[x] > maxi) maxi = nums[x];
                else continue;
            }
            ans[i] = maxi;
            i++;
            j++;
        }
        return ans;
    }
}