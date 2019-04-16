package doublepoint.solution141;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode point1 = head;
        ListNode point2 = head.next;
        while (point1 != null && point2 != null && point2.next != null) {
            if(point1 == point2){
                return true;
            }
            point1 = point1.next;
            point2 = point2.next.next;
        }
        return false;
    }
}
