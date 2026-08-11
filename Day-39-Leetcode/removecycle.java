class removecycle {
    public static void removeloop(Node head) {
        Node slowptr = head;
        Node fastptr = head;
        while(fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            if(slowptr == fastptr) {
                slowptr = head;
                Node prev = null;
                while(slowptr != fastptr) {
                    prev = fastptr;
                    slowptr = slowptr.next;
                    fastptr = fastptr.next;
                }
                if(prev == null) {
                    while(fastptr.next != slowptr) {
                        fastptr = fastptr.next;
                    }
                    fastptr.next = null;
                } else {
                    prev.next = null;
                }
                return;
    }
}