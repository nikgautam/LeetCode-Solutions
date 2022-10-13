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
        
        ListNode prev=node,curr=node, next = curr.next;
        
        while( next != null ){
            //Swapping
            int swap = next.val;
            next.val = curr.val;
            curr.val = swap;
            
            prev = curr;
            curr = next;
            next = curr.next;
            
        }
        
        prev.next = null;
        
//         ListNode tempHead = node;
        
//         while( tempHead.next != null ){
            
//             int swap = tempHead.val;
//             tempHead.val = tempHead.next.val;
//             tempHead.next.val = swap;
            
//             tempHead = tempHead.next;
//         }
        
//         tempHead = null;
    }
}