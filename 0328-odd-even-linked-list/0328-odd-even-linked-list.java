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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head ;
        }
        // Making a new Linked List 
        ListNode dummy = new ListNode(0) ;
        ListNode newHead = dummy ;
        ListNode temp = head ;
        int count = 1 ;

        
// _________FOR THE ODD ONES FIRST____________
        while(temp != null){
            if(count % 2 != 0 ){
                newHead.next = new ListNode(temp.val) ;
                newHead = newHead.next ;
            
            }
         
                temp = temp.next ;
                count++ ;
           

        }
        // _____FOR THE EVEN ONES___________
        temp = head ;
        count = 1 ;
        while(temp != null){
            if(count % 2 == 0 ){
                newHead.next = new ListNode(temp.val) ;
                
                newHead = newHead.next ;
            }
         
                temp = temp.next ;
                count++ ;
            
        }
        // Hamne dummy isliye banaya kyuki dummy is always at the new Head position and returning the newHead of the list hi hame puri LL dega 
        return dummy.next;
    }
};