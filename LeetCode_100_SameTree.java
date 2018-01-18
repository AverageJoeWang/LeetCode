/**
 * Created by oliverwang on 2018/1/18.
 */


public class LeetCode_100_SameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null)
        {
            if (p.val == q.val)
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            else return false;
        }
        else if (p == null && q == null)
            return true;
        else return false;
    }
}
