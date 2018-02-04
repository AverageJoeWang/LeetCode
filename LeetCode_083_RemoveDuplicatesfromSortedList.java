/**
 * Created by oliverwang on 2018/2/4.
 */


public class LeetCode_083_RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null){
            if (node.next == null) break;
            if (node.val == node.next.val)
                node.next = node.next.next;
            else node = node.next;
        }
        return head;
    }
}
