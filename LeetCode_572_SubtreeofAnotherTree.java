/**
 * Created by oliverwang on 2018/1/29.
 */


public class LeetCode_572_SubtreeofAnotherTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) return true;
        if (s == null) return false;
        if (isSame(s, t)) return true;
        else
            return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    public boolean isSame(TreeNode s, TreeNode t){
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        else return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}
