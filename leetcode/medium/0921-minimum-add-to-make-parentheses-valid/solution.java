class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        for(int i = 0 ; i < n;i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }else{
                if(s.charAt(st.peek()) == ')'){
                    st.pop();
                } else{
                    count++;
                }
            }
        }

        if(!st.isEmpty()){
            st.pop();
            count++;
        }
        return count;   
    }
}