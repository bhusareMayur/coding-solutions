/*Structure of the doubly linked list  Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/

class Solution {
    public Node deleteAllOccurOfX(Node head, int x) {
        // code here
        if(head == null) return null;
        Node temp = head;
        while(temp != null){
            if(temp.data == x){
                if(temp == head) head = temp.next;
                
                if(temp.prev != null){
                  temp.prev.next = temp.next;
                } 
                if(temp.next != null){
                  temp.next.prev = temp.prev;
                } 

        }
            temp = temp.next;
        }
        return head;
    }
}