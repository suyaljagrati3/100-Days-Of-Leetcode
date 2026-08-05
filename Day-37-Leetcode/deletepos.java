public static Node deleteAtPosition(Node head, int position) {
    if(head == null) {
        return null;
    }
    if(position == 1) {
        head = head.next;
        if(head != null) {
            head.prev = null;
        }
        return head;
    }

    Node temp = head;
    for(int i =1; i<position && temp != null; i++) {
        temp = temp.next;
    }
    if(temp == null) {
        return head;
    }
    if(temp.next == null) {
        temp.prev.next = null;
        temp.prev = null;
        return head;
    }
    temp.prev.next = temp.next;
    temp.next.prev = temp.prev;
    return head;
}