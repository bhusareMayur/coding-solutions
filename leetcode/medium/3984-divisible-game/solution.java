class Solution {
    public int divisibleGame(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();

        for(int i = 0 ; i <n;i++){
            int t = nums[i];

            for(int j = 2;j*j <= t;j++){
                if(t%j == 0){
                    st.add(j);
                    while(t % j == 0) t/=j;
                }
            }
            if(t>1) st.add(t);
        }

        if(st.isEmpty()) st.add(2);

        long b = Long.MIN_VALUE;
        int kAns = -1;

        for(int k:st){
            long curr = 0;
            long maxi = Long.MIN_VALUE;
            
            for(int x:nums){
                curr += (x % k == 0) ? x : -x;
                if(curr > maxi ) maxi = curr;

                if(curr < 0) curr = 0;
            }
            if(maxi > b || (maxi == b && k < kAns)){
                b = maxi;
                kAns = k;
                
            }
        }

        long mod = 1_000_000_007L;
        
        long ans = (((b % mod + mod) % mod) * kAns % mod);

        return (int)ans;
        
        
    }
}