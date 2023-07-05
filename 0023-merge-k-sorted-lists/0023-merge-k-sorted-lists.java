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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q= new PriorityQueue<>();
        for(int i=0; i<lists.length; i++){
            while(lists[i]!=null){
                q.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while(!q.isEmpty()){
            ListNode node = new ListNode(q.poll());
            temp.next = node;
            temp = node;
        }
        return head.next;
      
      
    
        
    }
}



















