class Solution {
    public void sortColors(int[] nums) {
        int[] frq = new int[3];
        for(int i = 0 ;i<nums.length;i++){
            frq[nums[i]]++;
        }
        int i =0;
        while(frq[0] > 0){
            nums[i] = 0;
            i++;
            frq[0]--;
        }
        while(frq[1] > 0){
            nums[i] = 1;
            i++;
            frq[1]--;
        }
        while(frq[2] > 0){
            nums[i] = 2;
            i++;
            frq[2]--;
        }
    }
}