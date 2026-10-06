class Solution {
    public int[][] insert(int[][] arr, int[] newInterval) {
        // Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int a = newInterval[0];
        int b = newInterval[1];
        if(arr.length == 0){
            return new int[][] {{a,b}};
        }
        int[][] extendedArr = new int[arr.length + 1][2];
        int idx = 0;
        boolean inserted = false;
        for (int[] interval : arr) {
            if (!inserted && a < interval[0]) {
                extendedArr[idx++] = newInterval;
                inserted = true;
            }
            extendedArr[idx++] = interval;
        }
        if (!inserted) {
            extendedArr[idx] = newInterval;
        }
        arr = extendedArr; 
        
        List<int[]> ans = new ArrayList<>();

        int prevStart = arr[0][0];
        int prevEnd = arr[0][1];
        for(int i = 1 ; i < arr.length;i++){
            if(a <= prevEnd){
                prevEnd = Math.max(prevEnd, b);
                // i--;
            }
            if(arr[i][0] <= prevEnd){
                prevEnd = Math.max(prevEnd, arr[i][1]);

            }
            else{
                ans.add(new int[]{prevStart, prevEnd});
                prevStart = arr[i][0];
                prevEnd = arr[i][1];

            }
        }
        ans.add(new int[]{prevStart, prevEnd});
        return ans.toArray(new int[ans.size()][]);
    }
}