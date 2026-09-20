class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0 ; i<n;i++){
            s.add(nums[i]);
        }
        int maxLength = 0;
        for(int num : s){
            if(!s.contains(num - 1)){
            int currLength = 1;
            int temp = num;
            while(s.contains(temp+1)){
               temp++;
               currLength++;
            }
            maxLength = Math.max(currLength,maxLength);
         }
        }
        return maxLength;
    }
}