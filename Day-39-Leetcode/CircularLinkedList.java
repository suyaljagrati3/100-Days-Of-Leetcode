import java.util.Scanner;

class CircularLinkedList {

    // Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    // Creation of Circular Linked List
    void create(int n, Scanner sc) {

        for (int i = 0; i < n; i++) {

            System.out.print("Enter data: ");
            int data = sc.nextInt();

            Node newNode = new Node(data);

            // First node
            if (head == null) {
                head = newNode;
                tail = newNode;

                // First node points to itself
                tail.next = head;
            }

            // Remaining nodes
            else {
                tail.next = newNode;
                tail = newNode;

                // Last node points back to head
                tail.next = head;
            }
        }
    }

    // Traversal
    void traverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;

        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CircularLinkedList list = new CircularLinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        list.create(n, sc);

        System.out.println("Circular Linked List:");
        list.traverse();


    }
}