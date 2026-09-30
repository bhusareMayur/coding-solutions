class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        boolean isZero = false;
        boolean isValid = false;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '0'){
                if(i != 0 && (s.charAt(i-1) == 1 || s.charAt(i-1) == 2)){
                    isValid = true;
                }
                isZero = true;
                break;
            }
        }
        if(isZero && isValid == false) return 0;
        else if(isValid) return n -1;
        return n;
    }
}