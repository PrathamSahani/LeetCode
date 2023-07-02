class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
     ListNode temp = head; int size =0;
     while(temp!=null){
         size++;
         temp = temp.next;
     }
     if(size<k){
         return head;
     }
     int count =0;
     ListNode prev =null, curr = head;
     while(curr!=null && count<k){
         ListNode tem = curr.next;
         curr.next = prev;
         prev = curr;
         curr = tem;
         count++;

     }
     if(curr!=null)
     head.next = reverseKGroup(curr, k);
     return prev;

          
    }
}