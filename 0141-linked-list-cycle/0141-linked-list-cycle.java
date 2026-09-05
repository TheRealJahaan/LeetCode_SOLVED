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

        // ===========APPROACH 1======================

        HashMap<ListNode , Boolean> map = new HashMap<>() ;

        ListNode current = head ;

        while(current != null){
            if(map.containsKey(current)){
                return true ;
            }
            map.put(current , true) ;
            current = current.next ;
        }
        return false; 


    }
}