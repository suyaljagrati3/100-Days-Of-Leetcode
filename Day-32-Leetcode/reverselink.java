
class reverselink {
    public ListNode reverse(ListNode head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode currNode = head; 
        while(currNode != null) {
            ListNode nextNode = currNode.next; //saving the next node
            currNode.next = preNode; // we are moving the pointer of the current node to the previous node
            preNode = currNode;
            currNode = nextNode;
        }
        head = preNode;
        return head;
    }
}