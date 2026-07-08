class Solution {
    public int findMin(int[] nums) {
       int n = nums.length;
       int s = 0;
       int e = n-1;
       int ans = nums[0];
       
       while(s<=e){
        int mid = ( s + e ) / 2;

        if(nums[mid] >= nums[0]){
            s = mid + 1;
        }
        else{
            e = mid - 1;
            ans = nums[mid];
        }
       }
    return ans;
    }
}