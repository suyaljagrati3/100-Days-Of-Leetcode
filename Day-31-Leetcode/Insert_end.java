class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Insert_end {

    public static Node addend(Node head, int data) {

        Node newNode = new Node(data);

        // If the list is empty
        if (head == null) {
            return newNode;
        }

        Node ptr = head;

        // Move to the last node
        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = newNode;

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node ptr = new Node(20);
        head.next = ptr;

        int data = 3;

        head = addend(head, data);

        ptr = head;

        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}
