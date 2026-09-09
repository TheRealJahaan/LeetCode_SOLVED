/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA ;
        ListNode b = headB ;
//     ye a and b ko last tak lekar jayega

        while(a != null && b != null){
            a = a.next ;
            b = b.next ;
        }
        // ab agar size different hue to kya karna he 
        // a and b ke beech difference rahega use cover karna he 
        // agar A bada he 

        if(b == null){
            int aExtraLen = 0 ;
            while(a != null){
                aExtraLen++ ;
                a = a.next ;
            }
            while(aExtraLen-- > 0){
                headA = headA.next ;
            }

        }
        else{//a == null 
            int bExtraLen = 0 ;
            while(b != null){
                bExtraLen++ ;
                b = b.next ;
            }
            while(bExtraLen-- > 0){
                headB = headB.next ;
            }

        }
        while(headA != null && headB != null){
            if(headA == headB ){
                return headA ;
            }
            else{
                headA = headA.next ;
                headB = headB.next;
            }
        }
        return null ;
    }
}