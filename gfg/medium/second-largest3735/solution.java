class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int FG = Integer.MIN_VALUE;
        int SG = Integer.MIN_VALUE;
        
        for(int i = 0 ; i <n;i++){
            if(arr[i] > FG){
                SG = FG;
                FG = arr[i];
            }
            else if(arr[i] > SG && arr[i] != FG) SG = arr[i];
        }
        if(SG < 0) return -1;
        return SG;
    }
}