
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode temp = headA;
        while(temp != null) {
            lenA++;
            temp = temp.next;
        }
       temp = headB;
        while(temp != null) {
            lenB++;
            temp = temp.next;
        }

          ListNode ptrA = headA;
         ListNode ptrB = headB;
        int diff = Math.abs(lenA - lenB);
        if(lenA > lenB) {
         
        for(int i=0; i<diff; i++) {
            ptrA = ptrA.next;
        } 
        } else {
            for(int i=0; i<diff; i++) {
                ptrB = ptrB.next; 
            }
        }   while(ptrA != null && ptrB != null) {
            if(ptrA == ptrB) {
                return ptrA;
            }
            else {
                ptrA = ptrA.next;
                ptrB = ptrB.next;
            }
            
        } 
        return null;
    }
}