class Solution {
    public int maxDepth(String s) {
        // Stack<Character> st = new Stack<>();
        int n = 0;
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                n++;
            }
            else if(s.charAt(i) == ')'){
                n--;
                // st.pop();
            }
            ans = Math.max(ans,n);
        }
        return ans;
    }
}