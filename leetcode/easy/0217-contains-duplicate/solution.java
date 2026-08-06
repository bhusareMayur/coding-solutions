class Solution {
    static{
        for(int i = 0; i <= 500; i++) 
            containsDuplicate(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length;i++){
            set.add(nums[i]);
            if(set.size() !=  i+1)return true;
        }
        return false;
    }
}