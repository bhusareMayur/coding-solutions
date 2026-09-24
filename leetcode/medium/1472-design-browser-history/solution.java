class Node {
    String url;
    Node prev;
    Node next;

    public Node(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
class BrowserHistory {
   private Node curr ;
    public BrowserHistory(String url) {
        this.curr = new Node(url);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        this.curr.next = newNode;
        newNode.prev = this.curr;
        this.curr = this.curr.next;
    }
    
    public String back(int steps) {
        
        while(steps > 0 && this.curr.prev != null){
            this.curr = this.curr.prev;
            steps--;

        }
        return this.curr.url;
    }
    
    public String forward(int steps) {
        
        while(steps > 0 && this.curr.next != null){
            this.curr = this.curr.next;
            steps--;

        }
        return this.curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */