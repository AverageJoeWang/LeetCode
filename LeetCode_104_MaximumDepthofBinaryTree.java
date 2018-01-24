/**
 * Created by oliverwang on 2018/1/24.
 */


public class LeetCode_104_MaximumDepthofBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null)
            return 1;
        else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1+(left > right ? left : right);
        }
    }
}
