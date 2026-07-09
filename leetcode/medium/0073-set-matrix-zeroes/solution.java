class Solution {
    public void setZeroes(int[][] m) {
        int m1 = m.length;
        int n = m[0].length;
        // HashMap<Integer,Integer> mp = new HashMap<>();
        boolean row[] = new boolean[m1];
        boolean col[] = new boolean[n];


        for(int i = 0 ; i <m1;i++){
            for(int j = 0 ; j <n;j++){
                if(m[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0 ; i <m1;i++){
            for(int j = 0 ; j <n;j++){
                if(row[i] == true || col[j] == true) m[i][j] = 0;
            }
        }    
    }
}