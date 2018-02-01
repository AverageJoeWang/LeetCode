/**
 * Created by oliverwang on 2018/2/1.
 */


public class LeetCode_235_LowestCommonAncestorofaBinarySearchTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) return root;
        if (root.val>Math.max(p.val, q.val))
            root = lowestCommonAncestor(root.left, p, q);
        else if (root.val < Math.min(p.val, q.val))
            root = lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
