class Node {
    int data;
    Node prev;
    Node next;
    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class introdll {
    public static Node inserthead(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node ptr = new Node(20);
        head.next = ptr;
        ptr.prev = head;
        head = inserthead(head, 20);
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}