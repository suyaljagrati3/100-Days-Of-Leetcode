class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
}
}

public class delete {
    public static Node delete(Node head, int key) {
         if(head == null ) {
            return null;
         }

         if(head.data == key) {
            return head.next;
         }
         Node ptr = head;
         Node pvs = null;
         while(ptr != null && ptr.data != key) {
            pvs = ptr;
            ptr = ptr.next;
         }
         pvs.next = ptr.next;
         return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node ptr = new Node(20);
        Node ptr1 = new Node(30);

        head.next = ptr;
        ptr.next = ptr1;

        head = delete(head , 20);
        ptr = head;

        while(ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
}