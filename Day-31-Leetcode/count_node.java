class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class count_node {
    public static int countNodes(Node head) {
        Node ptr = head;
        int count = 0;

        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        return count;
    }




    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int totalnodes = countNodes(head);
        System.out.println("Number of nodes in the linked list: " + totalnodes);
    }
}