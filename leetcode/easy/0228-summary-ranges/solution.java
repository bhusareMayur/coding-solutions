class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        if(n == 0) return new ArrayList<>();
        List<String> ans = new ArrayList<>();

        int start = nums[0];
        int end = nums[0];
        for(int i = 1 ;i <n;i++){
            if(nums[i] == end + 1){
                end = nums[i];
            }else{
                StringBuilder sb = new StringBuilder();
                if(start == end) sb.append(start+"");
                else{
                sb.append(start+"");
                sb.append("->");
                sb.append(end+"");
                }
                ans.add(sb.toString());
                
                start = nums[i];
                end = start;
                
            }
            
        }
        StringBuilder sb = new StringBuilder();
                if(start == end) sb.append(start+"");
                else{
                sb.append(start+"");
                sb.append("->");
                sb.append(end+"");
                }
                ans.add(sb.toString());
        return ans;
    }
}