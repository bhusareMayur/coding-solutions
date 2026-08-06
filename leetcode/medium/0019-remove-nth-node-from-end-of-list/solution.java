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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp = head;
      int size = 1;
      while(temp.next != null){
        temp = temp.next;
        size++;
      }
      
      if(size == 1 && n == 1) return null;
      if(size == n) return head.next;
    // System.out.println(size);
    n = size - n;
    temp = head;
    for(int i = 0 ; i <n-1;i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;
    // System.out.println(temp.val);

    return head;
    }
}