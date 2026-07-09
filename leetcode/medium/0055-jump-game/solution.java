class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        while(i < n && j < n){
            if(j == n-1) return true;
            if(nums[j] == 0) return false;
            j = j + nums[j];
            i++;
        }
        return false;
    }
}