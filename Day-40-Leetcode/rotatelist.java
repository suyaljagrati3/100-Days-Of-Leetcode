class Solution {
    public ListNode rotateRight(ListNode head , int k) {
        //Empty list

        if(head == null || head.next == null ) {
            return head;
        }

        //Finding the length of list
        int n = 1;
        ListNode tail= head;
        while(tail.next != null) {
            tail = tail.next;
            n++;
        }

        k = k % n;
        if(k == 0) {
            return head;
        }

        int steps = n-k;
        ListNode newTail = head;
        for(int i=1; i<steps; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
    }
    }
