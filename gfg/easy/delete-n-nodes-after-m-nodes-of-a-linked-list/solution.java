/*
delete n nodes after m nodes
The input list will have at least one element
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution {
    static void linkdelete(Node head, int n, int m) {
        // your code here
        Node temp = head;
        while (temp != null) {
        int i = 1;
        while(i < m && temp != null){
         temp = temp.next;   
         i++;
        }
        
         if (temp == null) return;

            Node temp2 = temp.next;

        
            i = 1;
            while (i <= n && temp2 != null) {
                temp2 = temp2.next;
                i++;
            }
            temp.next = temp2;

            temp = temp2;
        
        }
    }
}