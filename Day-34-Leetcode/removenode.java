
class Solution {
    public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode prev = dummy;
    ListNode ptr = head;
      while(ptr != null) {
    if(ptr.val == val) {
prev.next = ptr.next;
ptr = ptr.next;
} 
else {
prev = ptr;
ptr = ptr.next;
}
}

return dummy.next;
    }
}