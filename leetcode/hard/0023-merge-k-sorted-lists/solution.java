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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if (n == 1)
            return lists[0];
        if (n == 0)
            return null;
        ListNode t1 = lists[0];
        for (int i = 1; i < n; i++) {
            ListNode res = new ListNode(-1);
            ListNode ans = res;
            ListNode t2 = lists[i];
            ans = res;
            while (t1 != null && t2 != null) {
                if (t1.val < t2.val) {
                    res.next = t1;
                    t1 = t1.next;
                } else {
                    res.next = t2;
                    t2 = t2.next;
                }
                res = res.next;

            }
            while (t1 != null) {
                res.next = t1;
                res = res.next;
                t1 = t1.next;
            }
            while (t2 != null) {
                res.next = t2;
                res = res.next;
                t2 = t2.next;
            }

            t1 = ans.next;
        }
        return t1;
    }
}