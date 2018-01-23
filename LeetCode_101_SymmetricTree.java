import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by oliverwang on 2018/1/21.
 */


public class LeetCode_101_SymmetricTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addFirst(root.left);
        deque.addLast(root.right);

        TreeNode preNode;
        TreeNode postNode;

        while (!deque.isEmpty())
        {
            preNode = deque.pollFirst();
            postNode = deque.pollLast();
            if (preNode == null && postNode == null)
                continue;
            if (preNode == null || postNode == null)
                return false;
            if (preNode.val != postNode.val)
                return false;
            else {
                deque.addFirst(preNode.right);
                deque.addFirst(preNode.left);

                deque.addLast(postNode.left);
                deque.addLast(postNode.right);
            }

        }
        return true;
    }
}
