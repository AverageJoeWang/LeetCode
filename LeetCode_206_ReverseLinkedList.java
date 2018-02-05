import java.util.Stack;

/**
 * Created by oliverwang on 2018/2/5.
 */


public class LeetCode_206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        ListNode cur = head;
        while (node != null){
            stack.push(node.val);
            node = node.next;
        }
        while (!stack.empty()){
            cur.val = stack.pop();
            cur = cur.next;
        }
        return head;
    }
}
