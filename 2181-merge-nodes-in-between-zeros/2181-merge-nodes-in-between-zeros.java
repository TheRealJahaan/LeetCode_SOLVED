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
    public ListNode mergeNodes(ListNode head) {
        // ListNode temp = head ;
        // ListNode newHead = new ListNode(0) ;
        // ListNode newTail = newHead ;
        // int sum = 0 ;
        // while(temp != null){
        //     while(temp.val != 0 ){
        //         sum = sum + temp.val ;
        //         temp = temp.next ;
        //     }

        //     if(sum > 0) {
        //         newTail.next = new ListNode(sum) ;
        //         newTail = newTail.next ;
        //     }
        //     sum = 0 ;
        //     temp = temp.next ;
        // }
        // return newHead.next ;

        // =========== OPTIMAL SOLUTION ====================== O(1) ---> IN PLACE solution 

        // read --> Node for traversal 
        // write --> Node for value insert 

        //    Read aage badega aur jese hi 0 milega sum ko write me daal dega 

        ListNode write = head ;
        ListNode read = head.next ;

        
        while(read != null){
            int sum = 0 ;

            while(read.val != 0 ){
                sum = sum + read.val ;
                read = read.next ;
            }
            write.val = sum ;

            write.next = read.next ;
            read = read.next ;
            write = write.next ;
        }
        return head ;
    }
}

