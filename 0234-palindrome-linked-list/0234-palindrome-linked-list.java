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
    public ListNode Midpoint(ListNode head){
        // Finding the Mid Point Using the tortoise Hare algorithm
        ListNode fast = head ;
        ListNode slow = head ;

        while(fast != null ){
            fast = fast.next ;
            if(fast != null ){
                fast = fast.next ;
                slow = slow.next ;
            }
            
        }
        return slow ;
    }

    public ListNode reverseLL(ListNode head){
        ListNode prevNode = null ;
        ListNode currentNode = head ; 

        while(currentNode != null){
            ListNode forwardNode = currentNode.next ;

            currentNode.next = prevNode ;

            prevNode = currentNode;
            currentNode = forwardNode ;

        }
        return prevNode ;
    }
    public boolean isPalindrome(ListNode head) {
        if(head== null){
            return true ;
        }
        if(head.next == null ){
            return true ;
        }
        // mid point LL -> break ;
        ListNode list2 = Midpoint(head) ;
        // list1 and list2 separate ;
        // Ab separate karne ke liye hum list1 me temp variable check karega ki temp.next = list2 to nhi and then use null me point kar denge usse 2 list separate ho jayegi 
        ListNode temp = head ;
        while(temp.next != list2) {
            temp = temp.next ;
        }
        temp.next = null ;

        // list2 -> reverse 
        ListNode head2 = reverseLL(list2) ;

        // list1 and list2 compare 
        ListNode temp1 = head ;
        ListNode temp2 = head2 ;

        while(temp1 != null && temp2 != null ){
            if(temp1.val != temp2.val){
                return false ;
            }
            else{
                temp1 = temp1.next ;
                temp2 = temp2.next ;
            }
        }
        // return true or false ;
        return true ;
    }
}