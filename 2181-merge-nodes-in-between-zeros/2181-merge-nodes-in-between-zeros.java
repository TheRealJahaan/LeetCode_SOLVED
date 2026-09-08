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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head ;
        int sum = 0 ;
        ListNode newHead = new ListNode(0) ;
        ListNode newTail = newHead ;
        while(temp != null){
            while(temp.val != 0){
                sum = sum + temp.val ;
                temp = temp.next; 
            }

            if(sum > 0 ){
                newTail.next = new ListNode(sum) ;
                newTail = newTail.next ;
            }

            sum = 0 ;
            temp = temp.next ;
        }
        
        return newHead.next ;

    }
}