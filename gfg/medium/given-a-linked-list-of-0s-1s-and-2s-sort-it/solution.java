/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        if(head == null || head.next == null) return head;
        Node z = new Node(-1);
        Node o = new Node(-1);
        Node t = new Node(-1);
        Node a = z;
        Node b = o;
        Node c = t;
        Node temp = head;
        
        while(temp != null){
            Node nextNode = temp.next;
            temp.next = null;
            
            if(temp.data == 0){
                z.next = temp;
                z = z.next;
            }
            else if(temp.data == 1){
                o.next = temp;
                o = o.next;
                
            }else{
                t.next = temp;
                t = t.next;
            }
            
            temp = nextNode;
        }
        z.next = (b.next != null) ? b.next : c.next;
        
        o.next = c.next;
        t.next = null;
        
        return a.next != null ? a.next : (b.next != null ? b.next : c.next);
    }
}