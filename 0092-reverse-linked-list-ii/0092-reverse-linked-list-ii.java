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
    ListNode reverselist(ListNode ori,ListNode head,ListNode prev1,int right) {//213
        ListNode prev = null;
        ListNode need = head;
        int k=0;
        while(head!=null){
            k++;
            if(right==k-1) break;
            ListNode temp= head;
            head=head.next;
            temp.next=prev;
            prev=temp;
        }
        need.next=head;
        if(prev1!=null) {
            prev1.next=prev;
            return ori;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode temp=head;
        int c=0;
        ListNode prev=null;
        while(head.next!=null){
            c++;
            if(c==left) {
                return reverselist(temp,head,prev,right-left+1);
            }
            prev=head;
            head=head.next;
        }
       
        return null;
    }
}