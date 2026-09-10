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
    public ListNode reverseLL(ListNode head ) {
        ListNode prevNode= null ;
        ListNode currentNode = head ;

        while(currentNode != null){
            ListNode forwardNode = currentNode.next;
            currentNode.next = prevNode ;
            prevNode = currentNode ;
            currentNode = forwardNode ;
        }
        return prevNode ;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0 ){
            return head ;
        }

        // size nikalni padegi 
        ListNode temp= head ;
        int n = 0 ;
        while(temp != null ){
            n++ ;
            temp = temp.next;
        }
        k = k % n ;
        if(k == 0 ){
            return head ;
        }
        // reversing
        head = reverseLL(head) ;
        // reverse to ho gaya he 
         // ab ye logic karna he
        ListNode first = head ;
        ListNode second = head ;

        for(int i = 1 ; i < k ; i++){
            second = second.next ;
        }
        ListNode remaining = second.next ;
        second.next = null ;

        first = reverseLL(first) ;
        remaining = reverseLL(remaining) ;

        ListNode tail = first ;

        while(tail.next != null){
            tail = tail.next ;
        } 
        tail.next = remaining ;

        return first ;

      
    }

}