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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head ;
        // Ye saare same elements ka case ya fir starting elements matching ka case
        while(head != null && head.val == val ){
            head = head.next ;
        }

        while(temp != null && temp.next != null){
            if(temp.next.val == val ){
                // Skip karna he ise 
                temp.next = temp.next.next ;
            }
            else{
                // aage badho
                temp = temp.next ;

            }
        }
        return head;    
    }
}