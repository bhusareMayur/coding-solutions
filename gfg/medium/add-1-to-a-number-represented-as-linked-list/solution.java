/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        if(head == null) return null;
          Node prev = null;
           Node current = head;
           Node next = null;
        if(head.next != null){
            

           while (current != null) {
               next = current.next; 
               current.next = prev; 
               prev = current;       
               current = next;      
           }
           head = prev;
        }
           
           
           int carry = 1;
           Node temp = head;
           Node t2 = temp;
           while(temp != null){
              int sum = temp.data + carry;
              carry = sum / 10;
              int t = sum % 10;
              
              temp.data = t;
              t2 = temp;
              temp = temp.next;
           }
           
           if(carry != 0){
               Node a = new Node(carry);
               t2.next = a;
           }
           
           prev = null;
           current = head;
           next = null;

           while (current != null) {
               next = current.next; 
               current.next = prev; 
               prev = current;       
               current = next;      
           }
           return prev;
    }
}