class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int O = 0;
        int C = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '(') O++;
            else C++;
        }
        return Math.abs(C-O);
        
    }
}