/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode prev=node,curr=node;
        
        while( curr.next != null ){
            //Swapping
            int swap = curr.next.val;
            curr.next.val = curr.val;
            curr.val = swap;
            
            prev = curr;
            curr = curr.next;
            //next = curr.next;
            
        }
        
        prev.next = null;
    }
}