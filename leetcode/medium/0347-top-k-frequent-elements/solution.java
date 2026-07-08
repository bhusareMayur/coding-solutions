class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Arrays.sort(nums);
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
          int[] ans = new int[k];
         
          for(int i = 0 ; i <k;i++){
            int maxiF = Integer.MIN_VALUE;
            int maxi = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if(maxiF < e.getValue()){
                    maxi = e.getKey();
                }else continue;
            } 
            map.put(maxi , 0);
            ans[i] = maxi;
 
          }
        return ans;    
    }
}