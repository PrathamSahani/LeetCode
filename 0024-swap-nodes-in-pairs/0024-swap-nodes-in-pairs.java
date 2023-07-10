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
        ListNode prev = null, curr = head;
        int count =0;
        while(curr!=null && count<2){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }
        if(curr!=null){
            head.next = swapPairs(curr);
            
        }
        return prev;
    }
}