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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        int i = 1;
        ListNode temp = head;
        // ListNode prev = temp;
        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-1);
        ListNode a = odd;
        ListNode b = even;

        while(temp != null){
            ListNode nextNode = temp.next;
            temp.next = null; 
            if(i % 2 == 0){
                even.next = temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            temp = nextNode;
            i++;
        }
        odd.next = b.next;
     return a.next; 
    }
}