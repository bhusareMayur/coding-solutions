class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i <n-2;i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i] > 0) break;
            int y = i + 1;
            int z = n - 1;
            while(y<z){
                int sum = nums[i] + nums[y] + nums[z];
                if(sum == 0){
                    ans.add((Arrays.asList(nums[i], nums[y], nums[z])));

                    while(y < z && nums[y] == nums[y+1])y++;
                    while(y<z && nums[z] == nums[z-1])z--;
                    y++;
                    z--;
                }
                else if(sum > 0){
                    z--;
                }else y++;
            }
        }
        return ans;
    }
}