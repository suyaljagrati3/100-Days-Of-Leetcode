class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
 public class CountNodes {
    public static int count(Node head, int target) {
           int count = 0;
        Node ptr = head;
   
while(ptr != null) {
    if(ptr.data == target) {
   count++;
    }
     ptr= ptr.next;
}
return count;
}
public static void main(String[] args) {
    Node head = new Node(10);
    Node ptr = new Node(20);
   Node ptr1 = new Node(30);
 Node ptr4 = new Node(20);
 Node ptr5 = new Node(20);
 Node ptr6 = new Node(45);
 head.next = ptr1;
 ptr1.next = ptr2;
 ptr2.next = ptr3;
 ptr3.next = ptr4;
 ptr4.next= ptr5;
 ptr5.next = ptr6;

 int results  = count(head , 20);
    System.out.println("Occurences of 20: " + result);
   
 }

}

  









int count = 0;
while(ptr != null) {
    if(ptr.val == val) {
   count++;
    }
     ptr= ptr.next;
}