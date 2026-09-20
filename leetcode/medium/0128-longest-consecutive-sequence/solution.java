class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1) return 1;
        int maxLength=0;
        int l = 0;
        int r = 0;
        int d = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) {
                d++;
                continue;
            }

            if(nums[i] == nums[i-1]+1){
                r=i;
            }else{
                l=i;
            }
            maxLength = Math.max(maxLength,r-l+1-d);
        }
        return maxLength;
    }
}