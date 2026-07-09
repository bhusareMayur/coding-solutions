class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int count = 0;
        for(int i = 0 ; i < strs.length;i++){
            if(strs[i].length() <= Math.min(m,n)) count++;
            else if(strs[i].length() > m + n)continue;
            else{
                int ones = 0;
                int zeroes = 0;
                for(int j = 0;j<strs[i].length();j++){
                    if(strs[i].charAt(j) == '1')ones++;
                    else zeroes++;
                }
                if(ones <= n && zeroes <= m) count++;
            }
        }
        return count;
    }
}