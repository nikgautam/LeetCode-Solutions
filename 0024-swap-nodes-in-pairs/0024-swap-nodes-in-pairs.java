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
    public ListNode swapPairs(ListNode head) {
        
        if(head == null)
            return head;
        
        ListNode prev = null, curr = head, next = null;
        
        int i=0;
        while( i<2 && curr!=null ){
            
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
            i++;
            
        }
        
        if( next != null )
            head.next = swapPairs(next);
        
        return prev;
        
        
    }
    
}