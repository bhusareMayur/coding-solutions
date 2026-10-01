class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(q.size() < k) return q;
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        int i = 1;
        while(i <= k && !q.isEmpty()){
            st.push(q.poll());
            i++;
        }
        
    while(!st.isEmpty()){
        q.add(st.pop());
    }
    for( i = 0 ; i < n-k;i++){
        q.add(q.poll());
    }
        return q;
    }
}