/**
 * Created by oliverwang on 2018/2/2.
 */


public class LeetCode_141_LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null)
        {
            fast = fast.next.next;
            if (fast == null) return false;
            slow = slow.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
