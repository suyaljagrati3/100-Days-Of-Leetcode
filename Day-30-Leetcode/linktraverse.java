class Node {            //traversing a linked list 
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
  public class linktraverse {
   public static Node addBeg(Node head , int data ) {
   Node newNode = new Node(data);
   newNode.next = head;
   head = newNode;
   return head;

  }

public static void main(String[] args) {
    Node head = new Node(10);
    Node ptr = new Node(20);
    head.next = ptr;
    int data = 3;
    head = addBeg(head, data);
    ptr = head;
while(ptr != null) {
    System.out.print(ptr.data + " ");
    ptr = ptr.next;
}
}
  }
  
