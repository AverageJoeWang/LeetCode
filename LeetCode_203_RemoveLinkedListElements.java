/**
 * Created by oliverwang on 2018/2/3.
 */


public class LeetCode_203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode pre = node;
        ListNode cur = head;
        while (cur != null)
        {
            if (cur.val == val) pre.next = cur.next;
            else pre = pre.next;
            cur = cur.next;
        }
        return node.next;
    }
}
