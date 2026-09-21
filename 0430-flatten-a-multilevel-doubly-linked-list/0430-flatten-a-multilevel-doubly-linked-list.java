/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        // Mujhe null. vale case yaad nhi rehete next time se yaad rakhna 

        if(head== null){
            return head ;
        }

        Node p = head ;
  
        while(p != null ){
            if(p.child == null){
                p = p.next ;
            }
            else{
                // P has a child list 
                Node temp = p.child ;
                while(temp.next != null){
                    temp = temp.next ;
                }

                // Link manipulation 
                temp.next = p.next ;
                // p.next -> ki gurantee nhi he ki null he ki nahi 
                if(p.next != null){
                    p.next.prev = temp ;
                }
                p.next = p.child ;
                p.child.prev = p ;
                p.child = null;
            }

        }

        return head ;
    }
}