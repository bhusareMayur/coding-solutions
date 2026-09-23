/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/

class Solution {
    public int count(Node head, int key) {
        // code here
        int ans = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key) ans++;
            temp = temp.next;
        }
        return ans;
    }
}