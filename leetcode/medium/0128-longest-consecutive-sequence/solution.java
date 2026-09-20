class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0 )return 0;
        if(nums.length == 1) return 1;
       
        int maxLength=1;
        int currLength = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) continue;

            if(nums[i] == nums[i-1]+1){
                currLength++;
            }else{
               maxLength = Math.max(currLength,maxLength);
               currLength=1;
            }
        }
        return Math.max(currLength,maxLength);
    }
}