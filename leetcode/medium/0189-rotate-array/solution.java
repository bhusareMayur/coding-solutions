class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length;
        // reverse 0 - n
        // reverse 0 - k
        // reverse k - n

        rev(nums, 0,n-1);
        rev(nums , 0 , (k % n)-1);
        rev(nums , (k%n) , n - 1 );

    }
    private void rev(int[] nums, int i,int j){
        while(i <= j){
            int temp = nums[i];
            nums[i]  = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}