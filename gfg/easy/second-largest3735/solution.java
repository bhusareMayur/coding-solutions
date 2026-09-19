class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int FG = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(FG < arr[i]) FG = arr[i];
        }
        
        int SG = Integer.MIN_VALUE;
         for(int i = 0;i<n;i++){
            if(SG < arr[i] && arr[i] != FG) SG = arr[i];
        }
        if(SG < 0) return -1;
        return SG;
    }
}