/* Structure of Linked List Node
class Node
{
  int data;
  Node next;
  Node(int data)
  {
      this.data = data;
      this.next = null;
  }
}*/

class Solution {
    static void linkDelete(Node head, int n, int m) {
        // code here
        Node temp = head;
        while(temp != null){
            int i = m;
            int j = n;
        while(temp != null && i > 1){
            temp = temp.next;
            i--;
        }
        // System.out.println(temp.data);
        Node temp2 = temp;
         while(temp2 != null && j >= 0){
            temp2 = temp2.next;
            j--;
        }
        if(temp2 == null){
        if(temp != null) 
            temp.next = null;
            
            break;
        }
            
        
        temp.next = temp2;
        if(temp.next == null) continue;
        temp = temp.next;
        
        }
    }
}