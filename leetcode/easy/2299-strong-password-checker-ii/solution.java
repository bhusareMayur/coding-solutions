class Solution {
    public boolean strongPasswordCheckerII(String p) {
        int n = p.length();
        if(n < 8) return false;
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
        boolean l = false;
        boolean u = false;
        boolean d = false;
        boolean s = false;
        // boolean a = false;


        for(int i = 0;i<n;i++){
            char t = p.charAt(i);
            if(i != 0 && (t == p.charAt(i-1))) return false;
            if(Character.isLowerCase(t)){
                l = true;
            }
            else if(Character.isUpperCase(t)){
                u = true;
            }
            else if(Character.isDigit(t)){
                d = true;
            }
            else if(specialChars.indexOf(t) != -1){
                s = true;
            }
            
        }
        return l && u && s && d;
    }
}