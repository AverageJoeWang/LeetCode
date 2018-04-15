package ClassicQuestion;

/**
 * Created by oliverwang on 2018/4/15.
 */


public class LinkNodeisCircle {


    public static boolean LinkNodeisCircle(ListNode head){
        if (head == null || head.next == null || head.next.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null){
            fast = fast.next.next;
            if (fast == null) return false;
            slow = slow.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
