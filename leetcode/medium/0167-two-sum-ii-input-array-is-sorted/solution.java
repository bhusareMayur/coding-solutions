class Solution {
    public int[] twoSum(int[] nums, int t) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while(true){
            int sum = nums[i] + nums[j];
            if(sum == t){
                return new int[]{i+1,j+1};

            }
            else if(sum > t) j--;
            else i++;
        }
        // return new int[]{-1,-1};
        
    }
}