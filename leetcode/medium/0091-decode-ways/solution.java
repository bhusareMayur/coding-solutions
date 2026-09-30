class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        boolean isZero = false;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '0'){
                isZero = true;
                break;
            }
        }
        if(isZero) return 0;
        return n;
    }
}