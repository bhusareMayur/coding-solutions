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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        if(n == 0) return null;
        if(k % n == 0)return head;
        int j = n - (k % n)-1;
         temp = head;

        for(int i = 0 ;i<j;i++){
            temp = temp.next;
        }
        ListNode dummy = temp.next;
        temp.next = null;
        ListNode ans = dummy;
        while(dummy.next != null){
            dummy = dummy.next;
        }
        dummy.next = head;
        return ans;

    }
}