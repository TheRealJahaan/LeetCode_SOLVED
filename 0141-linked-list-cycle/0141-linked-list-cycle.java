/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        // // ===========APPROACH 1======================

        // HashMap<ListNode , Boolean> map = new HashMap<>() ;

        // ListNode current = head ;

        // while(current != null){
        //     if(map.containsKey(current)){
        //         return true ;
        //     }
        //     map.put(current , true) ;
        //     current = current.next ;
        // }
        // return false; 

        // ========OPTIMIZED APPROACH 2 ================

        // Using the slow and fast (tortoise hare appoarch )
        // Baat yaha esi he ki agar different speed he and cycle my bhaag rahe he then it is 100% gurantee that sooner or later they will meet 
        // That's the complete point here

        ListNode fast = head ;
        ListNode slow = head ;

        while(fast != null){
            fast = fast.next ;
            if(fast != null){
                fast = fast.next ;
                slow = slow.next ;
            }
            if(fast == slow){
                return true ;
            }
        }
        return false ;

    }
}