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
    public ListNode solve(ListNode prevNode , ListNode currentNode ) {
        // Base Case 
        if(currentNode == null){
            return prevNode ;
        }
        // Processing

        ListNode forwardNode = currentNode.next ;
        currentNode.next = prevNode ;
        prevNode = currentNode ;
        currentNode = forwardNode ;
        // ______RECURSSION______
        ListNode ans = solve(prevNode , currentNode) ;
        return ans ;

    }
    public ListNode reverseList(ListNode head) {
        // Creating a Solve methiod that is recurssion 
        // Now in the recurssion i have to solve only one and the other Cases solved by recurssion 
        ListNode prevNode = null ;
        ListNode currentNode = head ;

        ListNode ans = solve(prevNode , currentNode ) ;
        return ans ;
    }
}