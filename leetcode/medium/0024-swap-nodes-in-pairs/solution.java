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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode a = head;
        ListNode b = head.next;
        head = b;
        while(a != null && b != null){
            ListNode c = b.next;
            a.next = c;
            b.next = a;
            
            if(a.next == null || a.next.next == null || b.next == null || b.next.next == null) break;

            a.next = c.next; 

            a =c;
            b = c.next;
        }
        return head;
    }
}