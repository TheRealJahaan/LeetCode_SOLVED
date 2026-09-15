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
        ListNode prevNode = null ;
        ListNode currentNode = head ;

        while(currentNode != null){
            ListNode forwardNode = currentNode.next ;
            currentNode.next = prevNode ;
            prevNode = currentNode ;
            currentNode = forwardNode ;
        }
        return prevNode ;
    }
    public ListNode swap(ListNode head , ListNode node1 , ListNode node2 ){
        int temp = node1.val ;
        node1.val = node2.val;
        node2.val = temp ;

        return head ;
    }
    public ListNode swapNodes(ListNode head, int k) {
        // Matlab iss question me kth node from begining and kth node from the end ko swap karna he 
        ListNode originalHead = head ;
        ListNode temp = originalHead ;

        for(int i = 1 ; i < k ; i++){
            temp = temp.next ;
        }

        ListNode reversedHead = reverse(head) ;
        ListNode temp2 = reversedHead ;

        for(int i = 1 ; i < k ; i++){
            temp2 = temp2.next ;
        }
    
        swap(originalHead , temp , temp2) ;
        head = reverse(reversedHead) ;
        return head;

    }
}