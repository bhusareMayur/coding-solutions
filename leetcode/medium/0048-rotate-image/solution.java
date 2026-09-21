class Solution {
    public void rotate(int[][] m) {
        int n = m.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }

        // reverse the rows 
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = n - 1;
            while (j < k) {
                int temp = m[i][k];
                m[i][k] = m[i][j];
                m[i][j] = temp;
                j++;
                k--;
            }
        }

    }
}