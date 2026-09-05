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
    public ListNode reverseLL(ListNode head) {
        ListNode prevNode = null ;
        ListNode currentNode = head ;
        while(currentNode != null){
            ListNode forwardNode = currentNode.next ;

            currentNode.next = prevNode;
            prevNode = currentNode ;
            currentNode = forwardNode ;
        }
        return prevNode ;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Removing nthe from the end is basically removing moving size - n time to the list 


        head = reverseLL(head) ;
//         single Node case solved
        if(n == 1 ) {
            head = head.next ;
            return reverseLL(head) ;
        }
        // Now main Logic for n > 1 nodes 
        // hamne reverse to kar diya 
        ListNode prev = head ;
        for(int i = 1 ; i < n - 1  ; i++){
            prev = prev.next ;
        }
        // ListNode current = prev.next ;
        // ListNode forward = prev.next.next ;
        // Hamne terms use nhi kiye yaha
    
        prev.next = prev.next.next ;

        return reverseLL(head); 

    }
}