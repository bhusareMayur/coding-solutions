class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1) return 1;
        int n = nums.length;
        int mini = 0;
        int maxi = 0;
        for(int i = 0 ; i < n;i++){
            if(nums[mini] > nums[i]) mini  = i;
            if(nums[maxi] < nums[i]) maxi = i; 
        }

        int w1 = maxi > mini ? maxi + 1 : mini + 1;
        int w2 = maxi < mini ? n - maxi : n- mini;
        int w3 = maxi < mini ? (maxi + 1 + (n - mini)) : (mini + 1 + (n - maxi));

        int ans = Integer.MAX_VALUE;
        if(ans > w1) ans = w1;
        if(ans > w2) ans = w2;
        if(ans > w3) ans = w3;



        return ans;

    }
}