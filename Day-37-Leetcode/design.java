class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}



class MyLinkedList {
    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }


    public int get(int index) {
        if(index < 0 || index >= size) {
            return -1;
        }
        Node temp = head;
      for(int i=0; i<index; i++) {
        temp = temp.next;
      }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        if(head != null) {
            head.prev = newNode;
        }
        head = newNode;   
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null) {  //if the list is empty
            head = newNode;
            size++;
            return;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index <0 || index > size) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == size) {
            addAtTail(val);
            return;
        }
     
       
        Node temp = head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
       

        Node newNode = new Node(val);
        newNode.prev = temp.prev;
        newNode.next = temp;
        temp.prev.next = newNode;
        temp.prev = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index <0 || index >= size) {
            return;
        }       
     if(index == 0) {
        head = head.next;
        if(head != null) {
            head.prev = null;
        }
        size--;
        return;
     }
     Node temp = head;
     for(int i=0; i < index; i++) {
        temp = temp.next;
     }
    
      if(temp.next == null) {
        temp.prev.next = null; 
         
      } else {
      temp.prev.next = temp.next;
      temp.next.prev = temp.prev;
      }
      size--;
    }
}  

