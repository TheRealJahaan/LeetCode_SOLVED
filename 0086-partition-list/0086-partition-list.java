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
    public ListNode partition(ListNode head, int x) {
        ListNode lesshead = new ListNode(-1) ;
        ListNode lessTail = lesshead;
        ListNode greaterHead = new ListNode(-1) ;
        ListNode greaterTail= greaterHead ;

        ListNode temp = head ;

        while(temp != null){
            if(temp.val < x) {
                ListNode newNode = new ListNode(temp.val) ;
                lessTail.next = newNode ;
                lessTail = lessTail.next ;
            }
            else{
                ListNode newNode1 = new ListNode(temp.val) ;
                greaterTail.next = newNode1 ;
                greaterTail = greaterTail.next ; 
            }
            temp = temp.next ;

        }
        lessTail.next = greaterHead.next ;
        greaterHead.next = null ;
        lesshead = lesshead.next ;

        return lesshead;
    }
}