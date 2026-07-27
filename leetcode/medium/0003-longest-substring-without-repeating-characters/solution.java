class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        int l = 0;
        int r = 0;

        while(r < n){
            char c = s.charAt(r);
            // not in string
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
                ans = Math.max(ans , sb.length());
                r++;

            }
            //in string 
            else{
                int j = sb.indexOf(String.valueOf(c));
                sb.delete(0, j + 1);
                for(int i = 0; i <= r;i++){
                    if(s.charAt(l) == c) {
                        l++;
                        break;
                        }
                    l++;
                }

            }

        }
        return ans;

    }
}