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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode tail = head;
        ListNode curr = head;
        ListNode prev = null;

        while(temp != null){
            int i = k;
            curr = temp;
            tail = temp;
            // prev = tail;
            ListNode check = temp;
            for(int c = 1; c < k; c++) {
                if(check == null || check.next == null) return head;
                check = check.next;
            }
            while(i > 1){
                if(tail == null){
                    // break;
                    return head;
                }
                // prev = tail;
                tail = tail.next;
                
                i--;
            }
            if(tail != null){
            temp = tail.next;
            reverse(curr , tail);
            if(curr == head){// first reverse
                head = tail;
            }else{
                prev.next = tail;
            }
            curr.next = temp;
            prev = curr;
            }else{
                temp = tail;
            }

        }
        return head;
        
    }
    public void reverse(ListNode s , ListNode e){
        ListNode prev = null;
        ListNode current = s;
        ListNode nextNode = null;
        
        ListNode stopNode = e.next; 

        while (current != stopNode) {
            nextNode = current.next; 
            current.next = prev;   
            prev = current;         
            current = nextNode;   
        }
    }
}