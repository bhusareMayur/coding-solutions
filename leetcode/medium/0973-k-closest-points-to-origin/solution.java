class Solution {
    public int[][] kClosest(int[][] p, int k) {
        int m = p.length;
        // int n = p[0].length;
        float[][] r = new float[m][2];


        for(int i = 0;i<m;i++){
            int x = p[i][0];
            int y = p[i][1];
            r[i][0] = i;
            r[i][1] = (float)Math.sqrt((x*x) + (y*y));
        }
      
         Arrays.sort(r, (a, b) -> Float.compare(a[1], b[1]));

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < k;i++){
            list.add(new ArrayList<>(Arrays.asList(p[(int)r[i][0]][0], p[(int)r[i][0]][1])));
        }

        int[][] ans = new int[list.size()][2];
        for(int i = 0 ; i < list.size();i++){
             ArrayList<Integer> pair = list.get(i);
    
             ans[i][0] = pair.get(0);
            ans[i][1] = pair.get(1);
        }
        return ans;
    }
}