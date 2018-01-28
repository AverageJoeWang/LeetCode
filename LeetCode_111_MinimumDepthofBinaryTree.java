/**
 * Created by oliverwang on 2018/1/28.
 */


public class LeetCode_111_MinimumDepthofBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null)
            return minDepth(root.right) + 1;
        if (root.right == null)
            return minDepth(root.left) + 1;
        return Math.min(minDepth(root.right), minDepth(root.left)) + 1;

    }
}
