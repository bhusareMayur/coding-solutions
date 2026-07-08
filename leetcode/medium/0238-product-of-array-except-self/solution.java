class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int prod2 = 1;
        int zeroes=0;
        for(int i = 0 ; i < nums.length;i++){
            prod  *= nums[i];
            if(nums[i] != 0) prod2 *= nums[i];
            else zeroes++;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                if(zeroes == 1) nums[i] = prod2;
                else nums[i] = 0;
            }
            else if(zeroes != 0) nums[i] = 0;
            else{
                nums[i] = prod / nums[i];
            }
        }
        return nums;
    }
}