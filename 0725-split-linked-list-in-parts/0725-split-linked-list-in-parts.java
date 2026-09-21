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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // Iss array me sublist he head store ho rahe he naki puri list ke elments ek ek karke store ho rahe...
        // ab jab head store ho rahe -> and hum prev.next = null kar rahe he to utni list bhi ans me aa jati he 

        ListNode[] ans = new ListNode[k] ;

        // Finding out the length ;
        int n = 0 ;
        // ___________________________________
        int len = 0 ;
        ListNode temp = head ;
        while( temp != null){
            len++ ;
            temp = temp.next ;
        }
        // ____________________________________
        int baseSize = len / k ;
        int extranode = len % k ;

        ListNode prev = null ;
        ListNode currentNode = head ;

        for(int  part = 0;part < k ; part++ ){
            // insert current into array ;
            // ye dimaag lagane vala point tha 
            if(currentNode == null){
                ans[part] = currentNode ;
                continue ;
            }
            ans[part] = currentNode;
            
            int width = baseSize + (extranode > 0 ? 1 : 0 ) ;
            
            extranode-- ;
            for(int i= 1 ; i <= width ; i++){
                prev = currentNode ;
                currentNode  = currentNode.next ;

            }
            prev.next = null ;
            // Now we will move to next iteration 
            prev = null ;
        }
        return ans ;
    }
}