
public class cycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
         ListNode ptr = head;
        while(ptr != null) {
            if(visited.contains(ptr)) {
                return true;
            } else {
                visited.add(ptr);
            }
            ptr = ptr.next;
        }
        return false;
    }
}