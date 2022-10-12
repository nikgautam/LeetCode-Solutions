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
    
    public int length(ListNode head){
        ListNode temp = head;
        int l = 0;
        while( temp!=null ){
            temp = temp.next;
            l++;
        }
        
        return l;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = length(head);
        n = len - n;
        
        if( n==0 )
            return head.next;
        
        ListNode prev=null, curr=head;
        
        for(int i=0; i<n; i++){
            
            prev = curr;
            curr = curr.next;
            
        }        
        
        prev.next = curr.next;
        
        return head;
    }
}