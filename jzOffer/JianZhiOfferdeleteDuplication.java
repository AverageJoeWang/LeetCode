/**
 * Created by oliverwang on 2018/3/11.
 */


public class JianZhiOfferdeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode preNode = null;
        ListNode node = pHead;
        while (node != null) {
            if (node.next != null && node.val == node.next.val) {
                int value = node.val;
                while (node.next != null && node.next.val == value) {
                    node = node.next;
                }
                if (preNode == null) {
                    pHead = node.next;
                } else {
                    preNode.next = node.next;
                }
            } else {
                preNode = node;
            }
            node = node.next;
        }
        return pHead;
    }
}
