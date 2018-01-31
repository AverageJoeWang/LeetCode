import apple.laf.JRSUIUtils;

/**
 * Created by oliverwang on 2018/1/31.
 */


public class LeetCode_543_DiameterofBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    int d = 0;
    public int getDepth(TreeNode root){
        if (root == null) return 0;
        int l = getDepth(root.left);
        int r = getDepth(root.right);
        d = Math.max(d, l + r);
        return Math.max(l, r) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return d;
    }
}
