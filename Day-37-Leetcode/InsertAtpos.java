public static Node InsertAtpos(Node head, int pos , int data) {
    //empty list
    if(head == null) {
        return null;
    }
    //Insert at head
    if(pos ==1 ) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }
    Node temp = head;
    for(int i=1; i<pos && temp != null; i++) {
        temp = temp.next;
    }
    if(temp == null) {
        return head;
    }
    Node newNode = new Node(data);
    newNode.next = temp;
    newNode.prev = temp.prev;
    temp.prev.next = newNode;
    temp.prev = newNode;
    return head;
}