class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));
        List<int[]> ans = new ArrayList<>();

        int prevStart = arr[0][0];
        int prevEnd = arr[0][1];
        for(int i = 1 ; i < arr.length-1;i++){
            if(arr[i][0] <= prevEnd){
                ans.add(new int[]{prevStart, arr[i][1]});
                // prevStart = arr[i+1][0];
                // prevEnd = arr[i][1];

            }else{
                ans.add(new int[]{prevStart, prevEnd});

            }
            prevStart = arr[i+1][0];
            prevEnd = arr[i][1];

        }
        int[][] array = ans.toArray(new int[0][]);
        return array;
    }
}