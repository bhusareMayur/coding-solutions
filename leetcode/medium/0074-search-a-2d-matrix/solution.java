class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int m = arr.length;
        int n = arr[0].length;
        
        int i =0;
        int j = m - 1;
        int mid = 0;

        while(i < j){
             mid = (i + j) / 2;
            if(arr[0][mid] == t) return true;
            if(arr[0][mid] < t){
                j = mid-1;
            }
            else{
                i = mid;
            }
        }
         i =0;
         j = n - 1;
        while(i < j){
            int mid2 = (i+j)/2;
            if(arr[mid][mid2] == t) return true;
            else if(arr[mid][mid2] < t) i = mid+1;
            else j = mid -1;
        }
        return false;
    }
}