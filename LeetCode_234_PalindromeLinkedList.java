import java.util.Stack;

/**
 * Created by oliverwang on 2018/2/6.
 */


public class LeetCode_234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        ListNode newNode = head;
        while (cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        while (!stack.empty()){
            int a = stack.pop();
            if (a != newNode.val)
                return false;
            newNode = newNode.next;
        }
        return true;
    }
}
