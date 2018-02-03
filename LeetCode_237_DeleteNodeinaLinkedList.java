/**
 * Created by oliverwang on 2018/2/3.
 */


public class LeetCode_237_DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        if (node == null) return;
        ListNode next = node.next;
        if (next != null) {
            int value = next.val;
            node.val = value;
            node.next = next.next;
        }
    }
}
