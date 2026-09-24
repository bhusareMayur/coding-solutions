/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;      
            current = next;
        }
        head = prev;

        ListNode temp = head;
        int carry = 0;
        ListNode b = temp;
        while(temp != null){
            // int val = temp.val;
            int val = ((temp.val * 2 ) + carry);
            carry = 0;
            if(val > 9){
                temp.val = val % 10;
                carry = 1;
            }
            else
            temp.val = val;
            b = temp;
            temp = temp.next;

        }
        if(carry != 0){
            ListNode a = new ListNode(carry);
            b.next = a;
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