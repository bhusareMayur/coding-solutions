class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] p = new int[n];
        int s = 1;
        p[0]=1;
        for(int i = 1 ; i <n;i++){
            p[i] = p[i-1]*nums[i-1];
            // System.out.print(p[i]+" , ");
        }
        for(int i = n-1 ; i >=0;i--){
            p[i] *= s;
            s *= nums[i];
        }

        return p;
        
    }
}