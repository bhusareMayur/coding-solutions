/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null || head.next == null)return head;
        HashMap<Node,Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.val);
            map.put(temp,newNode);
            temp = temp.next;
        }

        Node ans = new Node(-1);
        Node res = ans;
        temp = head;
        Node prev = temp;

        while(temp != null){
            res.next = map.get(temp);
            res.random = map.get(prev.random);
            prev = temp;
            temp = temp.next;
            res = res.next;
        }
        res.random = map.get(prev.random);
        return ans.next;

    }
}