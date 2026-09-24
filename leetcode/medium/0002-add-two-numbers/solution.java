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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        int carry = 0;
        ListNode ans = new  ListNode(-1);
        ListNode res = ans;

        while(a != null && b != null){
            int sum = a.val + b.val + carry;
            carry = sum / 10;
            int t = sum % 10;
            ListNode temp = new ListNode(t);
            res.next = temp;
            res = res.next;
            a = a.next;
            b = b.next;
        }

        while(a != null){
            int sum = a.val + carry;
            carry = sum / 10;
            int t = sum % 10;
            ListNode temp = new ListNode(t);
            res.next = temp;
            res = res.next;
            a = a.next;
            // b = b.next;
        }
        while(b != null){
            int sum = b.val + carry;
            carry = sum / 10;
            int t = sum % 10;
            ListNode temp = new ListNode(t);
            res.next = temp;
            res = res.next;
            // a = a.next;
            b = b.next;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            res.next = temp;
            res = res.next;
        }
        return ans.next;
    }
}