class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
        int m = arr.length;
        int n = arr[0].length;
        if(n == 1 && m == 1) {
            if(arr[0][0] == t) return true;
            else return false;
        }
        
        int i =0;
        int j = m - 1;
        int row = 0;

        while(i <= j){
             int mid = i + (j - i) / 2;
            if(t >= arr[mid][0] && t <= arr[mid][n - 1]) {
                row = mid;
                i = 0;
                j = n - 1;
                while(i <= j){
                   int mid2 =  i + (j - i) / 2;
                     if(arr[row][mid2] == t) return true;
                    else if(arr[row][mid2] < t) i = mid2+1;
                    else j = mid2 -1;
                 }
                break;
            }
            if(arr[mid][0] > t){
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        //  i = 0;
        //  j = n - 1;
        // while(i <= j){
        //     int mid2 =  i + (j - i) / 2;
        //     if(arr[row][mid2] == t) return true;
        //     else if(arr[row][mid2] < t) i = mid2+1;
        //     else j = mid2 -1;
        // }
        return false;
    }
}