/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public boolean searchKey(Node head, int key) {
        // Code here
        // Node temp = head;
        // while(temp != null){
        //     if(temp.data == key) return true;
        //     temp = temp.next;
        // }
        // return false;
        if(head == null) return false;
        if(head.data == key) return true;
        
        return searchKey(head.next , key);
    }
}