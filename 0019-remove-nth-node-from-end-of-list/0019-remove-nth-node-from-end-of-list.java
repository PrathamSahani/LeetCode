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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head==null)return null;
       int count = 0;
       ListNode temp = head;
       while(temp!=null){
           count++;
           temp = temp.next;
       }
       if(count<n){
           return head;
       }
       if(count==n){
           return head.next;
       }
       int i=1; int ind = count-n;
       temp = head;
       while(i<ind){
        
           temp = temp.next;
           i++;
       }
       temp.next = temp.next.next;
       return head;
     }
}












