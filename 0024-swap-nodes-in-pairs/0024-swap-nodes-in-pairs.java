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
        if(head == null || head.next ==  null ) return head;
        ListNode ans = head.next;
        ListNode prev = null;
        ListNode earprev = null;
        ListNode slow=head;
        boolean found = false;
        int c  = 1;
       
        while(slow!= null){
            ListNode temp = slow.next;
            if(c % 2 == 1){
                if(c==1){
                 found = true;
                earprev = slow;}
                prev = slow ;
            }
            else {
                if(found) earprev.next = slow;
                slow.next = prev;
                prev.next = temp;
                earprev = prev;
            }
            slow = temp;
            c++;
        }
        return ans;
    }
}