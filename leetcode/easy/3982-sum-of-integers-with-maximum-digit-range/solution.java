class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;

        int maxi = -1;
        int ans = 0;

        for(int i = 0 ; i < n;i++){
            int t= nums[i];
            int mini = 9;
            int maxD = 0;

            while(t>0){
                int d = t%10;
                if(d<mini) mini = d;
                if(d>maxD) maxD = d;
                t/=10;
            }

            int diff = maxD - mini;
            if(diff > maxi){
                maxi = diff;
                ans = nums[i];
            }else if(diff == maxi){
                ans += nums[i];
            }
        }
        return ans;
    }
}