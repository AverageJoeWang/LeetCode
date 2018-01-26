/**
 * Created by oliverwang on 2018/1/26.
 */


public class LeetCode_404_SumofLeftLeaves {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val = x;}
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        else if (root.left != null && root.left.left == null && root.left.right == null)
            return root.left.val + sumOfLeftLeaves(root.right);
        else
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
