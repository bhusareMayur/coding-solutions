class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp = n;
        while( temp > 0){
            int d = temp % 10;
            sum += Math.pow(d,3);
            temp /= 10;
        }
        if(sum == n) return true;
        
        return false;
    }
}