class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[0]));
        List<int[]> ans = new ArrayList<>();

        int prevStart = arr[0][0];
        int prevEnd = arr[0][1];
        for(int i = 1 ; i < arr.length;i++){
            if(arr[i][0] <= prevEnd){
                prevEnd = Math.max(prevEnd, arr[i][1]);

            }else{
                ans.add(new int[]{prevStart, prevEnd});
                prevStart = arr[i][0];
                prevEnd = arr[i][1];

            }
        }
        ans.add(new int[]{prevStart, prevEnd});
        // int[][] array = ans.toArray(new int[0][]);
        // return array;
        return ans.toArray(new int[ans.size()][]);
    }
}