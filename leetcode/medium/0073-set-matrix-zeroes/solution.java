class Solution {
    public void setZeroes(int[][] m) {
        int m1 = m.length;
        int n = m[0].length;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0 ; i <m1;i++){
            for(int j = 0 ; j <n;j++){
                if(m[i][j] == 0) mp.put(i,j);
            }
        }

        for(Map.Entry<Integer, Integer> e : mp.entrySet()){
            int i = e.getKey();
            int j = e.getValue();
            
            // row j++
            for(int y = 0;y<n;y++){
                m[i][y] = 0;
            }
            // col i++
            for(int y = 0;y<m1;y++){
                m[y][j] = 0;
            }

        }


        
    }
}