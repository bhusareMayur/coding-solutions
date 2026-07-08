class Solution {
    public int findMin(int[] nums) {
       int n = nums.length;
       int s = 0;
       int e = n-1;
       int ans = 0;
       
       while(s<=e){
        int mid = ( s + e ) / 2;

        if(nums[mid] > nums[0]){
            s = mid + 1;
        }
        else if(nums[mid] < nums[0]){
            e = mid - 1;
        }
        if(s==e) ans = nums[s];
       }
    return ans;
    }
}