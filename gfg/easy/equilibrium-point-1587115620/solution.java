class Solution {
    public static int findEquilibrium(int nums[]) {
        // code here
        int n = nums.length;
               int[] ls = new int[n];
               int[] rs = new int[n];
               ls[0] = 0;

               for(int i = 0 ; i < n-1;i++){
                   ls[i+1] = ls[i]+nums[i];
               }
               rs[n-1]=0;
               for(int i = n-1 ; i >= 1;i--){
                   rs[i-1] = rs[i]+nums[i];
               }
               for(int i = 0 ; i < n;i++){
                   if(rs[i]==ls[i])return i;
               }
               return -1;
    }
}
