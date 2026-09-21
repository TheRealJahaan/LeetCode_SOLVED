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
    public ListNode reverse(ListNode head) {
        ListNode curr = head ;
        ListNode prev = null ;
        while( curr != null){
            ListNode forward = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = forward ;
        }
        return prev ;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode reverseHead = reverse(head) ;
        ListNode temp = reverseHead ;
        ListNode ansHead = new ListNode(-1); 
        ListNode ansTail   = ansHead;
        int sum = 0;
        int carry = 0 ;
        while(temp != null){
            sum = 2 * (temp.val) + carry ;
            
            int digit = sum%10 ;
            carry = sum/10 ;
            ListNode valuetoinsert = new ListNode(digit) ;
            ansTail.next = valuetoinsert ;
            ansTail = valuetoinsert ;
            temp = temp.next ;

        }
        if(carry > 0){
            ListNode valuetoinsert = new ListNode(carry);
            ansTail.next = valuetoinsert ; 
            ansTail = valuetoinsert ;
        }
        ansHead = ansHead.next ;
        ansHead = reverse(ansHead) ;
        return ansHead;


    }
}