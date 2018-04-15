package ClassicQuestion;

/**
 * Created by oliverwang on 2018/4/15.
 */


public class LinkNodegetEntrencePort {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null)
        {
            fast = fast.next.next;
            if (fast == null) return null;
            slow = slow.next;
            if (slow == fast) break;
        }
        if (fast.next == null) return null;

        slow = head;
        while (slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
