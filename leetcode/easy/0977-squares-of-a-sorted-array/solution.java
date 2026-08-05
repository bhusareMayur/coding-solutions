class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0 ;
        int j = n -1;
        int[] res = new int[n]; 
        int k = n-1;
        while(i <= j){
            int l = nums[i]*nums[i];
            int r = nums[j]*nums[j];
            if(l > r){
                res[k] = l;
                i++;
            }else{
                res[k] = r;
                j--;
            }
            k--;
        }
        return res;
    }
}