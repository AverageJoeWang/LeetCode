/**
 * Created by oliverwang on 2018/2/2.
 */


public class LeetCode_142_LinkedListCycleII {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
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
