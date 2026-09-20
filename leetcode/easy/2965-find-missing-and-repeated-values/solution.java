class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] fq = new int[n*n + 1];
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j<n;j++){
                fq[grid[i][j]]++;
            }
        } 
        int[] ans = new int[2];
        int k = 0;
        for(int i = 1 ; i < fq.length;i++){
            if(fq[i] == 0){
                ans[1]=i;
                k++;
            }
            else if(fq[i] == 2){
                ans[0] = i;
                k++;
            }
            if(k == 2) break;
        }
        return ans;
    }
}