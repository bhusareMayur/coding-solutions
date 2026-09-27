class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s); 

        for(int i = 0 ;i<sb.length();i++){
            if(s.charAt(i) == '(') st.push(i);
            else if(s.charAt(i) == ')') rev(sb , st.pop() , i);
            else continue;
        }
          StringBuilder ans = new StringBuilder();
        for(int i = 0;i < sb.length();i++){
            if(sb.charAt(i) == '(' || sb.charAt(i) == ')') continue;

            ans.append(sb.charAt(i));
        }

        return ans.toString();
    }
    public static void rev(StringBuilder sb, int i, int j) {
    int left = i;
    int right = j - 1;

    while (left < right) {
        char temp = sb.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, temp);
        
        left++;
        right--;
    }
}
}