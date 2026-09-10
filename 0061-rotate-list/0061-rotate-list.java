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
    // public ListNode reverseLL(ListNode head ) {
    // //     ListNode prevNode= null ;
    // //     ListNode currentNode = head ;

    // //     while(currentNode != null){
    // //         ListNode forwardNode = currentNode.next;
    // //         currentNode.next = prevNode ;
    // //         prevNode = currentNode ;
    // //         currentNode = forwardNode ;
    // //     }
    // //     return prevNode ;
    // // }
    public ListNode rotateRight(ListNode head, int k) {
    //     if(head == null || head.next == null || k == 0 ){
    //         return head ;
    //     }

    //     // size nikalni padegi 
    //     ListNode temp= head ;
    //     int n = 0 ;
    //     while(temp != null ){
    //         n++ ;
    //         temp = temp.next;
    //     }
    //     k = k % n ;
    //     if(k == 0 ){
    //         return head ;
    //     }
    //     // reversing
    //     head = reverseLL(head) ;
    //     // reverse to ho gaya he 
    //      // ab ye logic karna he
    //     ListNode first = head ;
    //     ListNode second = head ;

    //     for(int i = 1 ; i < k ; i++){
    //         second = second.next ;
    //     }
    //     ListNode remaining = second.next ;
    //     second.next = null ;

    //     first = reverseLL(first) ;
    //     remaining = reverseLL(remaining) ;

    //     ListNode tail = first ;

    //     while(tail.next != null){
    //         tail = tail.next ;
    //     } 
    //     tail.next = remaining ;

    //     return first ;

    //   ================== OPTIMIZED APPROACH=========================

        // Make the List circular first 

        //   |->(10) -> (20) -> (30) -> (40) --|
        //   |                                 |
    //       |_________________________________|

         
        //  if k = 1 to (30) vali node ko break karta he which is n-k vali ki next ko null par point karo 
        if(head == null || k == 0 ){
            return head ;
        }

        ListNode temp= head ;
        int n = 1 ;
        while(temp.next != null){
            n++ ;
            temp = temp.next ;
        }
        
        temp.next = head ;
        // circular ban gaya he 
        
        // size pata honi chahiye 
        k = k % n ;
        temp = head ;
        for(int i = 1 ; i <= n - k -1 ; i++){
            temp = temp.next ;
            head = head.next;
        }
        head = head.next ;
        temp.next = null ;

        return head  ;
    }

}